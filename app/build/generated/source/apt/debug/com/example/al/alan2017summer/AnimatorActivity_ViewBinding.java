// Generated code from Butter Knife. Do not modify!
package com.example.al.alan2017summer;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AnimatorActivity_ViewBinding implements Unbinder {
  private AnimatorActivity target;

  private View view2131558544;

  private View view2131558545;

  private View view2131558546;

  private View view2131558547;

  private View view2131558548;

  private View view2131558549;

  private View view2131558540;

  private View view2131558542;

  @UiThread
  public AnimatorActivity_ViewBinding(AnimatorActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AnimatorActivity_ViewBinding(final AnimatorActivity target, View source) {
    this.target = target;

    View view;
    target.tv = Utils.findRequiredViewAsType(source, R.id.animator_tv, "field 'tv'", TextView.class);
    view = Utils.findRequiredView(source, R.id.animator_trans, "method 'trans'");
    view2131558544 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.trans();
      }
    });
    view = Utils.findRequiredView(source, R.id.animator_scale, "method 'scale'");
    view2131558545 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.scale();
      }
    });
    view = Utils.findRequiredView(source, R.id.animator_color, "method 'color'");
    view2131558546 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.color();
      }
    });
    view = Utils.findRequiredView(source, R.id.animator_char, "method 'charFanim'");
    view2131558547 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.charFanim();
      }
    });
    view = Utils.findRequiredView(source, R.id.animator_alpha, "method 'alpha'");
    view2131558548 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.alpha();
      }
    });
    view = Utils.findRequiredView(source, R.id.animator_rotation, "method 'rotation'");
    view2131558549 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.rotation();
      }
    });
    view = Utils.findRequiredView(source, R.id.animator_bt_start, "method 'startAnimator'");
    view2131558540 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.startAnimator();
      }
    });
    view = Utils.findRequiredView(source, R.id.animator_bt_stop, "method 'cancelAnimator'");
    view2131558542 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.cancelAnimator();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    AnimatorActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tv = null;

    view2131558544.setOnClickListener(null);
    view2131558544 = null;
    view2131558545.setOnClickListener(null);
    view2131558545 = null;
    view2131558546.setOnClickListener(null);
    view2131558546 = null;
    view2131558547.setOnClickListener(null);
    view2131558547 = null;
    view2131558548.setOnClickListener(null);
    view2131558548 = null;
    view2131558549.setOnClickListener(null);
    view2131558549 = null;
    view2131558540.setOnClickListener(null);
    view2131558540 = null;
    view2131558542.setOnClickListener(null);
    view2131558542 = null;
  }
}
