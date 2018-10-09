# kotlin-mvp-koin
Example App with Koin library with MVP

Use Koin modules:
```
val DataModule = module {
    single { SharedPrefManager(App.get()) }

}

val PagesModule = module {
    factory { (view: LaunchContract.View) -> LaunchPresenter(view) as LaunchContract.Presenter }
    factory { (view: SignUpContract.View) -> SignUpPresenter(view) as SignUpContract.Presenter }
    factory { (view: HomeContract.View) -> HomePresenter(view) as HomeContract.Presenter }
}
```

Injection in View:
```
class HomeFragment : BasePresenterFragment<HomeContract.Presenter>(), HomeContract.View {
    ...
    companion object {
        fun newInstance(): HomeFragment = HomeFragment()
    }

    override val presenter: HomeContract.Presenter by inject { parametersOf(this) }
    ...
}
```
