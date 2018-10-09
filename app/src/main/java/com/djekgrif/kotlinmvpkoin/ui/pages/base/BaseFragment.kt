package com.djekgrif.kotlinmvpkoin.ui.pages.base

import android.content.pm.PackageManager
import android.support.v4.app.ActivityCompat
import android.support.v4.app.Fragment
import android.text.TextUtils
import android.util.Log
import com.djekgrif.kotlinmvpkoin.R
import com.djekgrif.kotlinmvpkoin.ui.pages.showToast

abstract class BaseFragment : Fragment(), RequestPermissionContext {

    private var permissionListener: RequestPermissionContext.PermissionListener? = null

    override fun usePermissions(permissionListener: RequestPermissionContext.PermissionListener, permissions: Array<String>) {
        if (!isPermissionAllowed(permissions)) {
            this.permissionListener = permissionListener
            if (!isShowPermissionRationale(permissions)) {
                Log.i("BaseFragment", "Show dialog 'Request permissions' for: " + TextUtils.join(", ", permissions))
                requestPermissions(permissions, PERMISSIONS_REQUEST)
            }
        } else {
            permissionListener.permissionsAllowed()
            this.permissionListener = null
        }
    }

    private fun isPermissionAllowed(permissions: Array<String>?): Boolean {
        if (permissions != null) {
            for (permission in permissions) {
                if (ActivityCompat.checkSelfPermission(activity!!, permission) != PackageManager.PERMISSION_GRANTED) {
                    return false
                }
            }
        }
        return true
    }

    private fun isShowPermissionRationale(permissions: Array<String>): Boolean {
        for (item in permissions) {
            if (shouldShowRequestPermissionRationale(item)) {
                showToast(String.format(getString(R.string.allow_permission_in_settings), item))
                return true
            }
        }
        return false
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        when (requestCode) {
            PERMISSIONS_REQUEST -> if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                permissionListener?.permissionsAllowed()
            } else {
                permissionListener?.permissionsForbidden()
                Log.w("BaseFragment", "Permission denied for:" + TextUtils.join(", ", permissions))
            }
        }
    }

}