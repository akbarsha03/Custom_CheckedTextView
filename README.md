###Custom Checked TextView 
####or
###Preference CheckBox

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Custom%20Checked%20TextView-green.svg?style=flat)](https://android-arsenal.com/details/1/2376)

![custom checked text view](https://raw.githubusercontent.com/akbarsha03/Custom_CheckedTextView/master/app/src/main/res/drawable/screenshot2.png?raw=true "Screen shot")

This is an alternative for android default **CheckedTextView** widget

Grab this library using following **Gradle** **dependency**

```groovy

    compile 'in.shaapps.librariez:preferencecheckbox:0.3-beta'

```

#####**or**

for **Maven** additionally add this url to the Main Project's **buid.gradle**

```groovy

    allprojects {
        repositories {
            jcenter()
            maven {
                url "https://dl.bintray.com/akbarsha03/maven/"
            }
        }
    }
    
```

###Setup

To use this **CustomCheckedTextview** from **.xml** add the following tags

```xml

    <in.shaapps.preferencecheckbox.CustomCheckedTextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            app:pDividerVisibility="true"
            app:pSubTitleText="Third Sub Title text with color"
            app:pSubTitleTextColor="#FF00FF"
            app:pSetFixedHeight="false"
            app:pTitleText="Third Title text" />
            
```

Do not forget to add namespace *xmlns:app="http://schemas.android.com/apk/res-auto"*
or If you want to use it from **Activity** use the following method

```java

    CustomCheckedTextView customCheckedTextView = (CustomCheckedTextView) findViewById(R.id.customCheckedTextView);
            customCheckedTextView.setTitleText("Title from coding");
            customCheckedTextView.setSubTitleText("Sub title from coding");
            customCheckedTextView.setChecked(true);
            customCheckedTextView.setDividerVisibility(false);
            
```

###List of available tags:

 - **pTitleText** - Title Text (String)
 - **pTitleTextColor** - Title text color (String e.g #FF00FF)
 - **pSubTitleText** - Sub title text (String)
 - **pSubTitleTextColor** - Sub title text color (String e.g #00FF00)
 - **pCheckedState** - Checkbox checked state (boolean true or false)
 - **pDividerColor** - Divider color (String e.g #F0F0FF)
 - **pDividerVisibility** - Divider visibility (boolean true or false)
 - **pTitleTextTypeface** - Title text typeface (e.g "font/fontname.ttf")
 - **pSubTitleTextTypeface** - Sub title text typeface (e.g "font/fontname.ttf")
 - **pSetFixedHeight** - Set Fixed Height or Height Wrap Content (e.g boolean true to wrap and false to set fixed height)
 - **pRippleEffect** - Coming soon

###Fixed Height or Height Wrap Content (**pSetFixedHeight**)

```xml

    app:pSetFixedHeight="true"

```

Please change the above attribute name from **pSetFlexibleHeight** to **pSetFixedHeight** if you're updating from older version to 0.3-beta


use this attribute and set to true when you don't want margin and fixed height when you have really large content for your custom checked text view

----------
Contact
============
In case if you find a bug, requesting a new feature or error implementing this library feel free to contact me

Email: akbar.sha03@gmail.com

twitter: @akbarsha03

http://shaapps.in/

Thank you Android Arsenal

License
============

    Copyright 2015 Akbar Sha Ebrahim

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.


