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

public class ActivityA_ViewBinding implements Unbinder {
  private ActivityA target;

  private View view2131427422;

  private View view2131427423;

  private View view2131427424;

  private View view2131427425;

  @UiThread
  public ActivityA_ViewBinding(ActivityA target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ActivityA_ViewBinding(final ActivityA target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.activity_a_a, "method 'toA'");
    view2131427422 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.toA(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.activity_a_b, "method 'toB'");
    view2131427423 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.toB(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.activity_a_c, "method 'toC'");
    view2131427424 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.toC(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.activity_a_d, "method 'toD'");
    view2131427425 = view;
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


    view2131427422.setOnClickListener(null);
    view2131427422 = null;
    view2131427423.setOnClickListener(null);
    view2131427423 = null;
    view2131427424.setOnClickListener(null);
    view2131427424 = null;
    view2131427425.setOnClickListener(null);
    view2131427425 = null;
  }
}
