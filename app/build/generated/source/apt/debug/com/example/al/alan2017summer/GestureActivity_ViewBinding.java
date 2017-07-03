// Generated code from Butter Knife. Do not modify!
package com.example.al.alan2017summer;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class GestureActivity_ViewBinding implements Unbinder {
  private GestureActivity target;

  @UiThread
  public GestureActivity_ViewBinding(GestureActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public GestureActivity_ViewBinding(GestureActivity target, View source) {
    this.target = target;

    target.tv = Utils.findRequiredViewAsType(source, R.id.activity_gesture_tv, "field 'tv'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    GestureActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tv = null;
  }
}
