<uses-permission android:name="android.permission.INTERNET" />

 <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="550dp"
        android:gravity="right"
        android:orientation="vertical">

<TextView
            android:id="@+id/textView3"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_gravity="right"
            android:layout_marginRight="10dp"
            android:gravity="right"
            android:text="Please Wait"
            android:textSize="16sp"
            android:textStyle="bold" />


        <Button
            android:id="@+id/button2"
            android:layout_width="100dp"
            android:layout_height="wrap_content"

            android:layout_marginRight="10dp"
            android:text="Close" />

        <WebView
            android:id="@+id/webview1"
            android:layout_width="match_parent"
            android:layout_height="match_parent" />
    </LinearLayout>



        final AlertDialog dialog2 = new AlertDialog.Builder(MainActivity.this).create();

        View inflate = getLayoutInflater().inflate(R.layout.cust, null);

        dialog2.setView(inflate);


        WebView webview1 = (WebView) inflate.findViewById(R.id.webview1);
        webview1.getSettings().setJavaScriptEnabled(true);
        webview1.getSettings().setSupportZoom(false);

        Button but2 = (Button) inflate.findViewById(R.id.button2);
TextView textview1 = (TextView) inflate.findViewById(R.id.textView3);
webview1.setWebViewClient(new WebViewClient());
        webview1.loadUrl("https://acceptable.a-ads.com/1901951");


but2.setVisibility(View.INVISIBLE);
        but2.postDelayed(new Runnable() {
            public void run() {
                but2.setVisibility(View.VISIBLE);
                textview1.setVisibility(View.INVISIBLE);
            }
        }, 3000);


        but2.setOnClickListener(new View.OnClickListener() { public void onClick(View view) { dialog2.dismiss(); } });

        dialog2.show();
    


initializeLogic();
