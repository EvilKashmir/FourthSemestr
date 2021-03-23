<#ftl encoding="UTF-8"/>
<#import "/spring.ftl" as spring/>
<footer class="footer-section mt-5">
    <div class="copyright-option">
        <div class="container">
            <div class="row">
                <div class="col-lg-7">
                    <ul>
                        <li><a href="/contact"><@spring.message 'footer.contacts'/></a></li>
                        <li><a href="?lang=ru">Ru</a></li>
                        <li><a href="?lang=en">En</a></li>
                    </ul>
                </div>
                <div class="col-lg-5">
                    <div class="co-text">
                        <p>
                            EvilKashmir&copy;
                            2021
                            <@spring.message 'footer.rights'/>.
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</footer>