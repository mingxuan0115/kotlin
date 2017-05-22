package demo.mxyang.com.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType.TYPE_CLASS_TEXT
import android.text.InputType.TYPE_TEXT_VARIATION_PASSWORD
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.EditText
import org.jetbrains.anko.*

class LearnAnkoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_learn_anko)
        LearnAnkoUI().setContentView(this)
    }

    class LearnAnkoUI : AnkoComponent<LearnAnkoActivity> {

        private val coustomerStyle = { v: Any ->
            when (v) {
                is Button -> v.textSize = 26f
                is EditText -> v.textSize = 24f
            }
        }

        override fun createView(ui: AnkoContext<LearnAnkoActivity>) = with(ui) {

            verticalLayout {
                padding = dip(20)
                imageView(android.R.drawable.ic_menu_manage).lparams {
                    margin = dip(16)
                    gravity = Gravity.CENTER
                }
                val name = editText {
                    hintResource = R.string.abc_search_hint

                }
                val password = editText {
                    hintResource = R.string.abc_search_hint
                    inputType = TYPE_CLASS_TEXT or TYPE_TEXT_VARIATION_PASSWORD
                }
                button("Log in") {
                    onClick { ui.owner.tryLogin(ui, name.text, password.text) }
                }
            }

        }

    }

    fun tryLogin(ui: AnkoContext<LearnAnkoActivity>, name: CharSequence?, password: CharSequence?) {
        ui.doAsync {
            Thread.sleep(500)
            activityUiThreadWithContext {
                if (checkCredentials(name.toString(), password.toString())) {
                    toast("Logged in! :)")
                    startActivity<MainActivity>()
                } else {
                    toast("Wrong password :( Enter user:password")
                }
            }

        }
    }

    private fun checkCredentials(name: String, password: String) = name == "user" && password == "password"
}
