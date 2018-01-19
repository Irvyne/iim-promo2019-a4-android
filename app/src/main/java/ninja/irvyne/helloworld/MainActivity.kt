package ninja.irvyne.helloworld

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), OnMapReadyCallback {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val mapFragment: SupportMapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
            mapFragment.getMapAsync(this);

            /*supportFragmentManager
                    .beginTransaction()
                    .add(R.id.fragment, WebViewFragment.newInstance(editText.text.toString()))
                    .commit()

            startActivity(
                    Intent(this, WebViewActivity::class.java).apply {
                        putExtra(WebViewActivity.ARG_URL, editText.text.toString())
                    }
            )*/
        }
    }

    override fun onMapReady(map: GoogleMap?) {
        Log.d("MainActivity", "onMapReady")
    }
}
