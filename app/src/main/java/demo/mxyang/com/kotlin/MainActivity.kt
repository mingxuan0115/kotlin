package demo.mxyang.com.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.text.InputType
import android.view.Gravity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*
import org.jetbrains.anko.custom.style

class MainActivity : AppCompatActivity() {
    companion object static {
        val PHONENUMBER_ID: Int = 1
        val PASSWORD_ID: Int = 2
        val LOGIN_ID: Int = 3
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        loginUi().setContentView(this@MainActivity)
//        text.text="aaaa"
////        text.setOnClickListener {   text.text="bbb" }
//
//        text.onClick { text.text="ccc" }
//        verticalLayout {
//            editText { hint="name" }
//            editText { hint="passward" }
//
//        }

        linearLayout() {
            val pass = editText {
                hint = "请输入密码"
            }.lparams {
                width = matchParent
                height = wrapContent
            }
            button("点击1") {
                onClick { toast("click, ${pass.text}") }

            }.lparams {
                width = matchParent
                height = wrapContent
                margin = dip(15)
            }
        }


    }

    inner class UI : AnkoComponent<MainActivity> {
        override fun createView(ui: AnkoContext<MainActivity>): View {
            return with(ui) {
                verticalLayout {
                    val textView = textView("我是一个TextView") {
                        textSize = sp(17).toFloat()
                        textColor = ContextCompat.getColor(this@MainActivity, R.color.colorAccent)
                        textColor = context.resources.getColor(R.color.colorAccent)
                    }.lparams {
                        margin = dip(10)
                        height = dip(40)
                        width = matchParent
                    }
                    val name = editText("EditText")
                    button("Button") {
                        onClick { view ->
                            toast("Hello, ${name.text}!")
                        }
                    }
                }
            }
        }

    }

    inner class loginUI1 : AnkoComponent<MainActivity> {
        override fun createView(ui: AnkoContext<MainActivity>): View {
            return with(ui) {
                relativeLayout {
                    editText {
                        id = PHONENUMBER_ID
                    }.lparams(width = matchParent, height = wrapContent) {
                        centerHorizontally()
                    }
                    editText {
                        id=PASSWORD_ID
                        inputType= InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
                    }.lparams(width= matchParent,height = wrapContent){
                        below(PHONENUMBER_ID)
                    }
                    button(ctx.getString(R.string.login)){
                        id= LOGIN_ID
                    }.lparams(width= wrapContent,height = wrapContent){
                        below(PASSWORD_ID)
                        centerHorizontally()
                    }
                }
            }
        }
    }


    inner class loginUi : AnkoComponent<MainActivity> {
        override fun createView(ui: AnkoContext<MainActivity>): View {
            return with(ui) {
                verticalLayout {
                    backgroundColor = context.resources.getColor(android.R.color.white)
                    gravity = Gravity.CENTER_HORIZONTAL
                    imageView(R.mipmap.ic_launcher).lparams {
                        width = dip(100)
                        height = dip(100)
                        topMargin = dip(64)
                    }
                    linearLayout { }
                }
            }

        }

    }


}
