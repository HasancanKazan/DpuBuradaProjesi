package hasancankazan.com.dpuburadaprojesi;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;


import static hasancankazan.com.dpuburadaprojesi.R.layout.ulasim;

/**
 * Created by Windows8 on 23.4.2016.
 */
public class ulasim extends Activity {

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        setContentView(ulasim);

        }
    }
