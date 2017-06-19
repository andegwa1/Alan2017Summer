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

public class ActivityB_ViewBinding implements Unbinder {
  private ActivityB target;

  private View view2131427432;

  private View view2131427433;

  private View view2131427434;

  private View view2131427435;

  @UiThread
  public ActivityB_ViewBinding(ActivityB target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ActivityB_ViewBinding(final ActivityB target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.activity_b_a, "method 'toA'");
    view2131427432 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.toA(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.activity_b_b, "method 'toB'");
    view2131427433 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.toB(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.activity_b_c, "method 'toC'");
    view2131427434 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.toC(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.activity_b_d, "method 'toD'");
    view2131427435 = view;
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


    view2131427432.setOnClickListener(null);
    view2131427432 = null;
    view2131427433.setOnClickListener(null);
    view2131427433 = null;
    view2131427434.setOnClickListener(null);
    view2131427434 = null;
    view2131427435.setOnClickListener(null);
    view2131427435 = null;
  }
}
