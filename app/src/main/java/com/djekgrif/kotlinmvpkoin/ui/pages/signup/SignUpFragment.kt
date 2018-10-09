package com.djekgrif.kotlinmvpkoin.ui.pages.signup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import com.djekgrif.kotlinmvpkoin.ActivityMediator
import com.djekgrif.kotlinmvpkoin.R
import com.djekgrif.kotlinmvpkoin.ui.pages.base.BasePresenterFragment
import com.djekgrif.kotlinmvpkoin.ui.pages.showSnackeBar
import com.djekgrif.kotlinmvpkoin.utils.notNull
import kotlinx.android.synthetic.main.fragment_signup.*
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class SignUpFragment : BasePresenterFragment<SignUpContract.Presenter>(), SignUpContract.View {

    companion object {
        fun newInstance(): SignUpFragment = SignUpFragment()
    }

    override val presenter: SignUpContract.Presenter by inject { parametersOf(this) }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_signup, null)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        signUpGoBtn.setOnClickListener { _ -> presenter.onClickGoBtn() }
        signUpUserName.setOnEditorActionListener{ _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                presenter.onClickGoBtn()
                return@setOnEditorActionListener true
            }
            false
        }
    }

    override fun getUserName(): String {
        return signUpUserName.text.toString()
    }

    override fun showUserNameValidation() {
        signUpContainer.showSnackeBar(R.string.please_enter_user_name)
    }

    override fun startHome() {
        activity.notNull {
            ActivityMediator.startHomeActivity(this)
        }
    }

    override fun closePage() {
        activity.notNull{
            finish()
        }
    }
}