final AlertDialog dialog2 = new AlertDialog.Builder(MainActivity.this).create();

View inflate = getLayoutInflater().inflate(R.layout.cust, null);

dialog2.setView(inflate);

dialog2.setTitle(Advertisement");

WebView webview1 = (WebView) inflate.findViewById(R.id.webview1);
		webview1.getSettings().setJavaScriptEnabled(true);
		webview1.getSettings().setSupportZoom(false);

Button but1 = (Button) inflate.findViewById(R.id.button1);

Button but2 = (Button) inflate.findViewById(R.id.button2);

webview1.loadUrl("https://acceptable.a-ads.com/1901951");



but2.setOnClickListener(new OnClickListener() { public void onClick(View view) { dialog2.dismiss(); } });

dialog2.show();
