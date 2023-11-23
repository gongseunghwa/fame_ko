package com.sh.fame_ko.util

import java.io.File

interface FameConst {

    companion object {
        const val MD5_SLAT: String = "riopwhjrv123bnopiw234q2ec"
        const val DEFAULT_PAGE : String = "1"
        const val PAGE_SIZE : String = "10"
        const val MAX_TITLE_COUNT : Int = 255
        const val MAX_CONTENT_COUNT : Int = 200000;
        const val MAX_SUMMARY_COUNT : Int = 255;
        const val DEFAULT_SUMMARY_FLAT : String = "<!--read more-->"
        const val MAX_COMMENT_CONTENT_COUNT : Int = 1023
        const val MAX_COMMENT_NAME_COUNT = 255
        const val MAX_COMMENT_EMAIL_COUNT = 255
        const val MAX_COMMENT_WEBSITE_COUNT = 255

        fun getEmailTemplateAdminContent(params : Map<String, String>) : String {
            var emptyString = ""
            var websiteName = params.getOrDefault("websiteName", emptyString)
            var name = params.getOrDefault("name", emptyString)
            var content = params.getOrDefault("content", emptyString)
            var website = params.getOrDefault("website", emptyString)
            var articleId = params.getOrDefault("articleId", emptyString)

            return "<!DOCTYPE html>" +
                    "<html>" +
                    "<head>" +
                    "<meta charset=\"UTF-8\">" +
                    "<title>" + websiteName + " Email</title>" +
                    "</head>" +
                    "<body>" +
                    "<h3>" + websiteName + "댓글</h3>" +
                    "<p>이름" + name + "평론：" + content + "</p>" +
                    "<br>" +
                    "<a href=\"" + website + "article/" + articleId + "\">상세보기</a>" +
                    "</body>" +
                    "</html>"
        }

        fun getEmailTemplateUserContent(params: Map<String, String>) : String {
            var emptyString = ""
            var websiteName = params.getOrDefault("websiteName", emptyString)
            var name = params.getOrDefault("name", emptyString)
            var content = params.getOrDefault("content", emptyString)
            var website = params.getOrDefault("website", emptyString)
            var articleId = params.getOrDefault("articleId", emptyString)

            return "<!DOCTYPE html>" +
                    "<html>" +
                    "<head>" +
                    "    <meta charset=\"UTF-8\">" +
                    "    <title>" + websiteName + " Email</title>" +
                    "</head>" +
                    "<body>" +
                    "<h3>나에게 온" + websiteName + "답장이 있습니다</h3>" +
                    "<p>발신" + name + "댓글：" + content + "</p>" +
                    "<br>" +
                    "<a href=\"" + website + "article/" + articleId + "\">상세보기</a>" +
                    "</body>" +
                    "</html>"
        }

        var FAME_HOME = ".fame" + File.separator
        var USER_HOME = System.getProperties().getProperty("user.home") + File.separator
        var UPLOAD_DIR = "upload${File.separator}"
        var MEDIA_DIR = UPLOAD_DIR + "media" + File.separator
        var BACKUP_DIR = UPLOAD_DIR + "backup" + File.separator
        var MEDIA_THUMBNAIL_SUFFIX = "_thumbnail"
        var MARKDOWN_SUFFIX = ".md"
    }
}