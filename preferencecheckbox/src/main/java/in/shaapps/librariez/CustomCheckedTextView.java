package in.shaapps.librariez;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import in.shaapps.preferencecheckbox.R;

/**
 * Preference Check Box
 * --
 * Created by Akbar Sha Ebrahim on 8/22/2015.
 */
@SuppressWarnings("unused")
public class CustomCheckedTextView extends LinearLayout implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    private String subTitleText;
    private String titleText;
    private boolean checkBoxCheckedState;
    private View horizontalView;
    private CheckBox checkBox;
    private TextView subTitleTextView;
    private TextView titleTextView;
    private boolean tempCheckBoxCheckedState = false;

    public CustomCheckedTextView(Context context) {
        super(context);
    }

    public CustomCheckedTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        /**
         * Get the resource values
         */
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomCheckedTextView, 0, 0);

        /**
         * Extract the resource values from typed array to variables
         */
        titleText = typedArray.getString(R.styleable.CustomCheckedTextView_pTitleText);
        int titleTextColor = typedArray.getColor(R.styleable.CustomCheckedTextView_pTitleTextColor,
                getResources().getColor(R.color.primaryTextColor));
        subTitleText = typedArray.getString(R.styleable.CustomCheckedTextView_pSubTitleText);
        int subTitleTextColor = typedArray.getColor(R.styleable.CustomCheckedTextView_pSubTitleTextColor,
                getResources().getColor(R.color.secondaryTextColor));
        checkBoxCheckedState = typedArray.getBoolean(R.styleable.CustomCheckedTextView_pCheckedState,
                false);
        int dividerColor = typedArray.getColor(R.styleable.CustomCheckedTextView_pDividerColor,
                getResources().getColor(R.color.dividerColor));
        boolean dividerCheckedState = typedArray.getBoolean(R.styleable.CustomCheckedTextView_pCheckedState,
                true);
        typedArray.recycle();

        /**
         * Set Orientation and Gravity for the root layout
         */
        setOrientation(LinearLayout.VERTICAL);
        setGravity(Gravity.CENTER_HORIZONTAL);

        /**
         * RD here
         */
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.custom_checked_textview, this, true);

        /**
         * Load preferences
         */
        tempCheckBoxCheckedState = checkBoxCheckedState;

        /**
         * Get the top layout
         */
        LinearLayout topLayout = (LinearLayout) getChildAt(0);

        /**
         * Get the first Relative layout which hold the Title and Sub title texts
         */
        RelativeLayout titleLayout = (RelativeLayout) topLayout.getChildAt(0);

        titleTextView = (TextView) titleLayout.getChildAt(0);
        subTitleTextView = (TextView) titleLayout.getChildAt(1);

        titleTextView.setText(TextUtils.isEmpty(titleText) ? "Title text" : titleText);
        titleTextView.setTextColor(titleTextColor);
        subTitleTextView.setText(TextUtils.isEmpty(subTitleText) ? "Sub title text" : subTitleText);
        subTitleTextView.setTextColor(subTitleTextColor);

        /**
         * Get the second Relative layout which hold the Check Box
         */
        RelativeLayout checkBoxLayout = (RelativeLayout) topLayout.getChildAt(1);
        checkBox = (CheckBox) checkBoxLayout.getChildAt(0);

        checkBox.setChecked(checkBoxCheckedState);
        checkBox.setOnCheckedChangeListener(this);

        topLayout.setOnClickListener(this);
        /**
         * Get the bottom layout
         */
        horizontalView = (View) getChildAt(1);
        horizontalView.setBackgroundColor(dividerColor);
        horizontalView.setVisibility(dividerCheckedState ? View.VISIBLE : View.GONE);

    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public CustomCheckedTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public CustomCheckedTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void onClick(View v) {
        if (tempCheckBoxCheckedState) {
            checkBox.setChecked(false);
            checkBoxCheckedState = false;
            tempCheckBoxCheckedState = false;
        } else {
            checkBox.setChecked(true);
            checkBoxCheckedState = true;
            tempCheckBoxCheckedState = true;
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        checkBoxCheckedState = tempCheckBoxCheckedState = isChecked;
    }

    public void setTitleText(String pTitleText) {
        this.titleTextView.setText(pTitleText);
    }

    public void setTitleTextColor(int pTitleTextColor) {
        this.titleTextView.setTextColor(pTitleTextColor);
    }

    public void setSubTitleText(String pSubTitleText) {
        this.subTitleTextView.setText(pSubTitleText);
    }

    public void setSubTitleTextColor(int pSubTitleTextColor) {
        this.subTitleTextView.setTextColor(pSubTitleTextColor);
    }

    public void setDividerColor(int pDividerColor) {
        this.horizontalView.setBackgroundColor(pDividerColor);
    }

    public String getTitleText() {
        return this.titleText;
    }

    public String getSubTitleText() {
        return this.subTitleText;
    }

    public void setCheckBoxCheckedState(boolean pCheckedState) {
        this.checkBox.setChecked(pCheckedState);
    }

    public void setDividerVisibility(boolean pCheckedState) {
        this.horizontalView.setVisibility(pCheckedState ? View.VISIBLE : View.GONE);
    }

    public boolean getCheckedState() {
        return this.checkBoxCheckedState;
    }

}
