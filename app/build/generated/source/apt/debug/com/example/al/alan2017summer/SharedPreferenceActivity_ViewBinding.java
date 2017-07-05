// Generated code from Butter Knife. Do not modify!
package com.example.al.alan2017summer;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SharedPreferenceActivity_ViewBinding implements Unbinder {
  private SharedPreferenceActivity target;

  private View view2131558608;

  private View view2131558607;

  @UiThread
  public SharedPreferenceActivity_ViewBinding(SharedPreferenceActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SharedPreferenceActivity_ViewBinding(final SharedPreferenceActivity target, View source) {
    this.target = target;

    View view;
    target.emailEditText = Utils.findRequiredViewAsType(source, R.id.activity_shared_pref_email, "field 'emailEditText'", EditText.class);
    target.passwordEditText = Utils.findRequiredViewAsType(source, R.id.activity_shared_pref_password, "field 'passwordEditText'", EditText.class);
    view = Utils.findRequiredView(source, R.id.activity_shared_pref_clear, "method 'clear'");
    view2131558608 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.clear(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.activity_shared_pref_login, "method 'login'");
    view2131558607 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.login();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    SharedPreferenceActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.emailEditText = null;
    target.passwordEditText = null;

    view2131558608.setOnClickListener(null);
    view2131558608 = null;
    view2131558607.setOnClickListener(null);
    view2131558607 = null;
  }
}
