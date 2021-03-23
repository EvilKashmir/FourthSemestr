<#ftl encoding="UTF-8"/>
<#import "/spring.ftl" as spring/>
<header class="header-section">
    <div class="top-nav">
        <div class="container">
            <div class="row">
                <div class="col-lg-6">
                    <ul class="tn-left">
                        <li><i class="fa fa-phone"></i> <a href="tel:89874777808">8-(987)-477-78-08</a></li>
                        <li><i class="fa fa-envelope"></i><a href="mailto:evilkashmir.kzn@gmail.com">evilkashmir.kzn@gmail.com</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <div class="menu-item">
        <div class="container">
            <div class="row">
                <div class="col-lg-3">
                    <div class="logo">
                        <a href="/main">
                            <h2>SiteName</h2>
                        </a>
                    </div>
                </div>
                <div class="col-lg-9">
                    <div class="nav-menu">
                        <nav class="mainmenu">
                            <ul>
                                <li class="<#if active=='main'>active</#if>"><a href="/main"><@spring.message 'header.main'/></a></li>
                                <li class="<#if active=='apartments'>active</#if>"><a href="/apartments"><@spring.message 'header.apartments'/></a></li>
                                <li class="<#if active=='contact'>active</#if>"><a href="/contact"><@spring.message 'header.contacts'/></a></li>
                                <li class="<#if active=='about-us'>active</#if>"><a href="/aboutUs"><@spring.message 'header.about.us'/></a></li>
                                <#if user??>
                                    <li class="<#if active=='profile'>active</#if>"><a href="/profile"><@spring.message 'header.profile'/></a></li>
                                    <li><a href="/quit">Выйти</a></li>
                                <#else>
                                    <li class="<#if active=='sign_in'>active</#if>"><a href="/signIn"><@spring.message 'header.sign_in'/></a></li>
                                    <li class="<#if active=='sign_up'>active</#if>"><a href="/signUp"><@spring.message 'header.sign_up'/></a></li>
                                </#if>
                            </ul>
                        </nav>
                    </div>
                </div>
            </div>
        </div>
    </div>
</header>