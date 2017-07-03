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

public class ActivityD_ViewBinding implements Unbinder {
  private ActivityD target;

  private View view2131558568;

  private View view2131558569;

  private View view2131558570;

  private View view2131558571;

  @UiThread
  public ActivityD_ViewBinding(ActivityD target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ActivityD_ViewBinding(final ActivityD target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.activity_d_a, "method 'toA'");
    view2131558568 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.toA(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.activity_d_b, "method 'toB'");
    view2131558569 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.toB(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.activity_d_c, "method 'toC'");
    view2131558570 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.toC(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.activity_d_d, "method 'toD'");
    view2131558571 = view;
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


    view2131558568.setOnClickListener(null);
    view2131558568 = null;
    view2131558569.setOnClickListener(null);
    view2131558569 = null;
    view2131558570.setOnClickListener(null);
    view2131558570 = null;
    view2131558571.setOnClickListener(null);
    view2131558571 = null;
  }
}
