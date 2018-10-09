package com.djekgrif.kotlinmvpkoin.ui.pages.base


interface RequestPermissionContext {

    class PermissionListener {
        fun permissionsAllowed() {}
        fun permissionsForbidden() {}
    }

    fun usePermissions(permissionListener: PermissionListener, permissions: Array<String>)
}