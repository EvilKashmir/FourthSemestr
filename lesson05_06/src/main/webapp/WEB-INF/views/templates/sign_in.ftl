<#ftl encoding="UTF-8"/>
<#import "/spring.ftl" as spring/>
<#import "layouts/base.ftl" as base>
<@base.main title="Войти" css=['main.css'] scripts=['main.js'] active='sign_in'>
    <main>
        <div class="container">
            <section class="mt-5 mb-4">
                <div class="row">
                    <div class="col"></div>
                    <div class="col-8 align-self-center">
                        <div class="card wish-list mb-4">
                            <div class="card">
                                <div class="card-body">
                                    <#if error??>
                                        <div style="padding-top: 20px">
                                            <div class="alert alert-danger fade show" role="alert">
                                                ${error}
                                                <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                                                    <span aria-hidden="true">&times;</span>
                                                </button>
                                            </div>
                                        </div>
                                    </#if>
                                    <h3 class="mb-4 text-black-80 mt-0 font-weight-bold"><@spring.message 'sign_in_page.authorization.title'/></h3>
                                    <h4 class="error-message" id="error-message"></h4>
                                    <form autocomplete="off" action="/signIn" method="post" id="form">
                                        <div class="form-group">
                                            <span class="text-black-50"><@spring.message 'sign_in_page.authorization.email.placeholder'/></span>
                                            <input id="email-signin" type="email" data-verify="email"
                                                   class="form-control" name="email"
                                                   required>
                                        </div>
                                        <div class="form-group">
                                            <span class="text-black-50"><@spring.message 'sign_in_page.authorization.password.placeholder'/></span>
                                            <input id="password-signin" type="password" class="form-control"
                                                   name="password" required>
                                        </div>
                                        <button id='submit'
                                                class="btn btn-primary btn-lg btn-block waves-effect waves-light"
                                                type="submit">
                                            <@spring.message 'sign_in_page.authorization.title'/>
                                        </button>
                                    </form>
                                    <hr>
                                    <p><a href="/signUp" class="text-secondary"><@spring.message 'sign_up_page.registration.title'/></a></p>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col"></div>
                </div>
            </section>
        </div>
    </main>
</@base.main>