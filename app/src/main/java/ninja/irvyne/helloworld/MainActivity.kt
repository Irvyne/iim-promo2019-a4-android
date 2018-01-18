package ninja.irvyne.helloworld

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            supportFragmentManager
                    .beginTransaction()
                    .add(R.id.fragment, WebViewFragment.newInstance(editText.text.toString()))
                    .commit()

            /*startActivity(
                    Intent(this, WebViewActivity::class.java).apply {
                        putExtra(WebViewActivity.ARG_URL, editText.text.toString())
                    }
            )*/
        }
    }
}
