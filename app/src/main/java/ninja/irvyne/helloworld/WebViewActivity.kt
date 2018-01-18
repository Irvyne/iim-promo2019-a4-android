package ninja.irvyne.helloworld

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_web_view.*


class WebViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        appWebView.webViewClient = WebViewClient()

        button1.setOnClickListener {
            appWebView.loadUrl("https://" + intent.getStringExtra(ARG_URL))
        }

        button2.setOnClickListener {
            appWebView.loadUrl("https://fnac.com")
        }
    }

    companion object {
        const val ARG_URL = "WebViewActivity.ARG_URL"
    }
}
