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

public class ActivityC_ViewBinding implements Unbinder {
  private ActivityC target;

  private View view2131558558;

  private View view2131558559;

  private View view2131558560;

  private View view2131558561;

  @UiThread
  public ActivityC_ViewBinding(ActivityC target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ActivityC_ViewBinding(final ActivityC target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.activity_c_a, "method 'toA'");
    view2131558558 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.toA(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.activity_c_b, "method 'toB'");
    view2131558559 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.toB(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.activity_c_c, "method 'toC'");
    view2131558560 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.toC(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.activity_c_d, "method 'toD'");
    view2131558561 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.toD(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view2131558558.setOnClickListener(null);
    view2131558558 = null;
    view2131558559.setOnClickListener(null);
    view2131558559 = null;
    view2131558560.setOnClickListener(null);
    view2131558560 = null;
    view2131558561.setOnClickListener(null);
    view2131558561 = null;
  }
}
