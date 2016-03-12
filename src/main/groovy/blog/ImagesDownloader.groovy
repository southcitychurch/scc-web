package blog

class ImagesDownloader {

    static void main(String... args) {
        def rss = new XmlSlurper(false,false).parse(this.getClass().getResourceAsStream('/southcitychurch-media.xml'))
        def allItems = rss.channel.item
        allItems.each { it ->
            println it.title
            String url = it.'wp:attachment_url'.text()
            println "Downloading $url"
            "curl -L -O $url".execute()
        }
        println "Done!"
    }
}
