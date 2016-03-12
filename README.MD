# Intro

This is the source code of the SouthCityChurch Dublin web site. 
The concept for the site is to leverage **Github** and **GitPages** to host both the source code and the generated web site one single repository.
The advantages of this approach are:

    1. GitHub enables a highly collaborative authoring flow here people can work as team in an independent and distributed fashion.
    2. The infrastructure is free and high quality

As result to be able to contribute to the web site you need to create a GitHub account if haven't already one at the address https://github.com/join .         
Depending on how you would like to contribute you may need to install software if you require to work with the source code locally on your own computer to:          
    1. Pull locally a copy of the source code
    2. Push changes and updates to the site

Probably the easiest way to go is to download and install GitHub Desktop client app available at https://desktop.github.com/. If you planning to make simple changes
you then maybe using one web based online editing using GitHub alone or http://prose.io/. Additionally you may what to use watch and start features of GitHub to receive
notifications of updates to the source code, or use the GitHub mobile app to also to get push notifications of content updates. 

The generated web site is accessible under http://luistrigueiros.github.io/southcitychurch/pages/about/welcome.html .

To keep the publishing and build of the web site fast it is recommended to keep the images in a separate image hosting solution and here only the source code so images.
So for example the media folder is pulling images from Google Photos album at https://goo.gl/photos/wG9ATnKdvF5kmkk3A . 


# Going deeper

This section is mostly relevant if you plan to do development here more detailed context info is provided.

As foundation frameworks the web site is using:  
 1. A static web site generator called JBake you can find more about it at http://jbake.org/ 
 2. Gradle is the build tool used for automation to build and publish the web site http://gradle.org/ 

To build the web site locally on you own system just clone the repo:

```Bash 
  git clone https://github.com/luistrigueiros/southcitychurch.git
```

And run the build command:
```
 gradle jbake
```

To publish the web site run the command:
```
 gradle publishGhPages
```

This will publish the generated static web site in a remote git branch called gh-pages *https://github.com/luistrigueiros/southcitychurch/tree/gh-pages* 
as this required by github pages to serve the site.

At the moment to publish you will need to setup git with ssh authentication.

[git-pages]:https://pages.github.com/
