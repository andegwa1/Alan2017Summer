// Generated code from Butter Knife. Do not modify!
package com.example.al.alan2017summer;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ResultActivity_ViewBinding implements Unbinder {
  private ResultActivity target;

  private View view2131558596;

  private View view2131558597;

  @UiThread
  public ResultActivity_ViewBinding(ResultActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ResultActivity_ViewBinding(final ResultActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.activity_result_bt1, "method 'toResult1'");
    view2131558596 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.toResult1(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.activity_result_bt2, "method 'toResult2'");
    view2131558597 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.toResult2(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view2131558596.setOnClickListener(null);
    view2131558596 = null;
    view2131558597.setOnClickListener(null);
    view2131558597 = null;
  }
}
