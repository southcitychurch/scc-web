# Intro

This is the source code of the SouthCityChurch Dublin web site. 
The concept for the site is to leverage **Github** to host both the source code and the generated web site.
The advantages of this approach are:

* GitHub enables a highly collaborative authoring flow. 
* People can work as team in an independent and distributed fashion.
* The infrastructure is free and high quality

To contribute to the web site you need to have a [GitHub Account](https://github.com/join). Depending on how you would like to contribute you may need to install software.
As required software to work with the site we recomend using:
* [GitHub Desktop client app available](https://desktop.github.com/).
* [Very simple easy to easy code aware editor](https://code.visualstudio.com/) 

If you planning to make simple changes you then maybe using one web based online editing using: 
 * GitHub alone 
 * [Web base editor for GitHub](http://prose.io/). 
 
Additionally you may what to:
* Use watch and start features of GitHub to receive notifications of updates to the source code
* Use the GitHub mobile app to also to get push notifications of content updates. 

The generated web site is accessible at http://southcitychurch.github.io/pages/about/welcome.html .

To keep the publishing and build of the web site fast it is recommended to keep the images in a separate image hosting solution and here only the source code so images.
So for example the media folder is pulling images from Google Photos album at https://goo.gl/photos/wG9ATnKdvF5kmkk3A . 


# Going deeper

This section is mostly relevant if you plan to do development here more detailed context info is provided.
The flow of working in the web site as a deeloper is the following:          

1. Pull locally a copy of the source code
2. Update the content, and run the build to publish a new version of the site
2. Push changes to the code so that they get saved and available for others



As foundation frameworks the web site is using:  
 1. A static web site generator called JBake you can find more about it at http://jbake.org/. 
 2. Gradle is the build tool used for automation to build and publish the web site, more info about it at http://gradle.org/. 

To build the web site locally on you own system just clone the repo:

```Bash 
  git clone https://github.com/southcitychurch/scc-web.git
```

And run the build command:
```Bash
 gradle jbake
```

To publish the web site run the command:
```Bash
 gradle publishGhPages
```
  
At the moment to publish you will need to setup git with ssh authentication, if you install the GitHub Desktop client app this will be made automatically for for. 

