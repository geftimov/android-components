## android-components

[![Release](https://img.shields.io/github/release/geftimov/android-components.svg?label=JitPack)](https://jitpack.io/#geftimov/android-components/v0.0.1)

List of useful components for Android.<br/>
More information for each component wiki.

<!-- Put the Maven coordinates in your HTML: -->
 <pre class="prettyprint">&lt;dependency&gt;
  &lt;groupId&gt;com.github.jitpack&lt;/groupId&gt;
  &lt;artifactId&gt;android-example&lt;/artifactId&gt;
  &lt;version&gt;<span id="latest_release">1.0</span>&lt;/version&gt;
&lt;/dependency&gt;  </pre>
 
<!-- Add this script to update "latest_release" span to latest version -->
<script>
      var user = 'geftimov'; // Replace with your user/repo
      var repo = 'android-components'
      
      var xmlhttp = new XMLHttpRequest();
      xmlhttp.onreadystatechange = function() {
          if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
              var myArr = JSON.parse(xmlhttp.responseText);
              populateRelease(myArr);
          }
      }
      xmlhttp.open("GET", "https://api.github.com/repos/geftimov/android-components/releases", true);
      xmlhttp.send();
      
      function populateRelease(arr) {
          var release = arr[0].tag_name;
          document.getElementById("latest_release").innerHTML = release;
      }
</script>

#### Components

 * [NoDefaultSpinner](https://github.com/geftimov/android-components/wiki/NoDefaultSpinner "NoDefaultSpinner") (Spinner with hint default item. When other item selected the default option is removed.)

#### Contributors

[Georgi Eftimov](https://github.com/geftimov "Georgi Eftimov")

##### Download

	repositories {
	    maven {
	        url "https://jitpack.io"
	    }
	}
	
	dependencies {
	        compile 'com.github.geftimov:android-components:<span id="latest_release">v0.0.0</span>'
	}


#### Changelog

###### v0.0.1

 * Added NoDefaultSpinner


## Licence

    Copyright 2015 Georgi Eftimov

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
