package jp.co.recruit_lifesytle.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import jp.co.recruit_lifestyle.android.widget.ColoringLoadingView;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    initView();

  }

  private void initView() {
    final ColoringLoadingView loadingView = (ColoringLoadingView) findViewById(R.id.main_loading);
    loadingView.setCharacter(ColoringLoadingView.Character.BUTTERFLY);
    loadingView.setColoringColor(0xFFFF1744);

    findViewById(R.id.main_start_button).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        loadingView.setVisibility(View.VISIBLE);
        loadingView.startDrawAnimation();
      }
    });
  }

}
