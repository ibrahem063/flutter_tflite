package sq.flutter.tflite;

import androidx.annotation.NonNull;

import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;

/** TflitePlugin */
public class TflitePlugin implements FlutterPlugin, MethodCallHandler {
  private MethodChannel channel;

  @Override
  public void onAttachedToEngine(@NonNull FlutterPluginBinding flutterPluginBinding) {
    channel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "tflite");
    channel.setMethodCallHandler(this);
  }

  @Override
  public void onMethodCall(MethodCall call, Result result) {
    result.notImplemented(); // لاحقًا تقدر تضيف الدوال حسب احتياجك
  }

  @Override
  public void onDetachedFromEngine(@NonNull FlutterPluginBinding binding) {
    channel.setMethodCallHandler(null);
  }
}
