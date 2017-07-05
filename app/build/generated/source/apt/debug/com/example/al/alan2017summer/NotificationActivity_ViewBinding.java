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

public class NotificationActivity_ViewBinding implements Unbinder {
  private NotificationActivity target;

  private View view2131558592;

  private View view2131558593;

  private View view2131558594;

  @UiThread
  public NotificationActivity_ViewBinding(NotificationActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public NotificationActivity_ViewBinding(final NotificationActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.activity_notification_small, "method 'smallNotification'");
    view2131558592 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.smallNotification(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.activity_notification_big, "method 'bigNotification'");
    view2131558593 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.bigNotification(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.activity_notification_pic, "method 'picNotification'");
    view2131558594 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.picNotification(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view2131558592.setOnClickListener(null);
    view2131558592 = null;
    view2131558593.setOnClickListener(null);
    view2131558593 = null;
    view2131558594.setOnClickListener(null);
    view2131558594 = null;
  }
}
