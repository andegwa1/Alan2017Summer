// Generated code from Butter Knife. Do not modify!
package com.example.al.alan2017summer;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RunnableHandlerActivity_ViewBinding implements Unbinder {
  private RunnableHandlerActivity target;

  @UiThread
  public RunnableHandlerActivity_ViewBinding(RunnableHandlerActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public RunnableHandlerActivity_ViewBinding(RunnableHandlerActivity target, View source) {
    this.target = target;

    target.editText = Utils.findRequiredViewAsType(source, R.id.activity_handler_runnable_et, "field 'editText'", EditText.class);
    target.button = Utils.findRequiredViewAsType(source, R.id.activity_handler_runnable_bt, "field 'button'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RunnableHandlerActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.editText = null;
    target.button = null;
  }
}
