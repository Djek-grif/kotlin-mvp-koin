package layout

import com.djekgrif.kotlinmvpkoin.ui.pages.base.BasePresenter
import com.djekgrif.kotlinmvpkoin.ui.pages.base.BaseView

interface LaunchContract {

    interface View : BaseView {
        fun startHome()
        fun startSignUp()
    }

    interface Presenter : BasePresenter<View> {

    }
}