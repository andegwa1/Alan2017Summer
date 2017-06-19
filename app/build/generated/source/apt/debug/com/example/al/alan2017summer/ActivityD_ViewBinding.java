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

  private View view2131558548;

  private View view2131558549;

  private View view2131558550;

  private View view2131558551;

  @UiThread
  public ActivityD_ViewBinding(ActivityD target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ActivityD_ViewBinding(final ActivityD target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.activity_d_a, "method 'toA'");
    view2131558548 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.toA(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.activity_d_b, "method 'toB'");
    view2131558549 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.toB(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.activity_d_c, "method 'toC'");
    view2131558550 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.toC(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.activity_d_d, "method 'toD'");
    view2131558551 = view;
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


    view2131558548.setOnClickListener(null);
    view2131558548 = null;
    view2131558549.setOnClickListener(null);
    view2131558549 = null;
    view2131558550.setOnClickListener(null);
    view2131558550 = null;
    view2131558551.setOnClickListener(null);
    view2131558551 = null;
  }
}
