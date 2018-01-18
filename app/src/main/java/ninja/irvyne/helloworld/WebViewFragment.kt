package ninja.irvyne.helloworld

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient


class WebViewFragment : Fragment() {
    private var mUrl: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mUrl = arguments?.getString(ARG_URL, "https://www.iim.fr")

        Log.d("WebViewFragment", "onCreate")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d("WebViewFragment", "onCreateView")

        return inflater.inflate(R.layout.fragment_web_view, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val webView = view as WebView
        webView.webViewClient = WebViewClient()
        webView.loadUrl(mUrl)

        Log.d("WebViewFragment", "onViewCreated")
    }

    companion object {
        private const val ARG_URL = "WebViewFragment.URL"

        fun newInstance(url: String): WebViewFragment = WebViewFragment().apply {
            arguments = Bundle().apply {
                if (url.contains("http://", false).not()) {
                    putString(ARG_URL, "http://" + url)
                } else {
                    putString(ARG_URL, url)
                }
            }
        }
    }
}
