<#ftl encoding="UTF-8"/>
<#import "/spring.ftl" as spring/>
<#macro main title active css=[] scripts=[]>
    <!DOCTYPE html>
    <html lang="ru" xmlns="http://www.w3.org/1999/html">
    <head>
        <meta charset="UTF-8">
        <title>${title}</title>
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link href="https://fonts.googleapis.com/css?family=Lora:400,700&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Cabin:400,500,600,700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="/views/css/bootstrap.min.css" type="text/css">
        <#list css as style>
            <link rel="stylesheet" type="text/css" href="/views/css/${style}">
        </#list>
    </head>
    <body>
    <#include "header.ftl">
    <#nested>
    <#include "footer.ftl">
    <script src="/views/js/bootstrap.min.js"></script>
    <#list scripts as script>
        <script src="/views/js/${script}"></script>
    </#list>
    </body>
    </html>
</#macro>