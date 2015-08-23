###Custom Checked TextView 
####or
###Preference CheckBox

![custom checked text view](https://www.dropbox.com/s/1o0ajpfpcbbkifu/device-2015-08-23-184751.png)
This is an alternative for android default **CheckedTextView** widget

Grab this library using following gradle dependency

    compile 'in.shaapps.librariez:preferencecheckbox:0.1-beta'

#####**or**

for **Maven** additionally add this url to the Main Project's **buid.gradle**

    allprojects {
        repositories {
            jcenter()
            maven {
                url "https://dl.bintray.com/akbarsha03/maven/"
            }
        }
    }

###Setup

To use this **CustomCheckedTextview** from **.xml** add the following tags

    <in.shaapps.preferencecheckbox.CustomCheckedTextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            app:pDividerVisibility="true"
            app:pSubTitleText="Third Sub Title text with color"
            app:pSubTitleTextColor="#FF00FF"
            app:pTitleText="Third Title text" />

Do not forget to add namespace *xmlns:app="http://schemas.android.com/apk/res-auto"*
or If you want to use it from **Activity** use the following method

    CustomCheckedTextView customCheckedTextView = (CustomCheckedTextView) findViewById(R.id.customCheckedTextView);
            customCheckedTextView.setTitleText("Title from coding");
            customCheckedTextView.setSubTitleText("Sub title from coding");
            customCheckedTextView.setCheckBoxCheckedState(true);
            customCheckedTextView.setDividerVisibility(false);

List of available tags:

 - pTitleText - Title Text (String)
 - pTitleTextColor - Title text color (String e.g #FF00FF)
 - pSubTitleText - Sub title text (String)
 - pSubTitleTextColor - Sub title text color (String e.g #00FF00)
 - pCheckedState - Checkbox checked state (boolean true or false)
 - pDividerColor - Divider color (String e.g #F0F0FF)
 - pDividerVisibility - Devider visibility (boolean true or false)
 - pTitleTextTypeface - coming soon
 - pSubTitleTextTypeface - coming soon

----------
contact: akbar.sha03@gmail.com
twitter: aksha03

Fork and Contribute :)
