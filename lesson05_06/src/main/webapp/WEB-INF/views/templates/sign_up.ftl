<#ftl encoding="UTF-8"/>
<#import "/spring.ftl" as spring/>
<#import "layouts/base.ftl" as base>
<@base.main title="Регистрация" css=['main.css'] scripts=['main.js'] active='sign_up'>
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
                                    <h3 class="mb-4 text-black-80 mt-0 font-weight-bold"><@spring.message 'sign_up_page.registration.title'/></h3>
                                    <h4 class="error-message" id="error-message"></h4>
                                    <@spring.bind "signUpForm"/>
                                    <form action="/signUp" autocomplete="off" method="post" id="form">
                                        <div class="form-group">
                                            <span class="text-black-50"><@spring.message 'sign_up_page.registration.email.placeholder'/></span>
                                            <@spring.formInput "signUpForm.email" "class='form-control'"/>
                                            <@spring.showErrors "<br>" "error"/>
                                        </div>
                                        <div class="form-group">
                                            <span class="text-black-50"><@spring.message 'sign_up_page.registration.firstname.placeholder'/></span>
                                            <@spring.formInput "signUpForm.firstname" "class='form-control'"/>
                                            <@spring.showErrors "<br>" "error"/>
                                        </div>
                                        <div class="form-group">
                                            <span class="text-black-50"><@spring.message 'sign_up_page.registration.lastname.placeholder'/></span>
                                            <@spring.formInput "signUpForm.lastname" "class='form-control'"/>
                                            <@spring.showErrors "<br>" "error"/>
                                        </div>
                                        <div class="form-group">
                                            <span class="text-black-50"><@spring.message 'sign_up_page.registration.password.placeholder'/></span>
                                            <@spring.formPasswordInput "signUpForm.password" "class='form-control'"/>
                                            <@spring.showErrors "<br>" "error"/>
                                        </div>
                                        <div class="form-group">
                                            <span class="text-black-50"><@spring.message 'sign_up_page.registration.password_again.placeholder'/></span>
                                            <@spring.formPasswordInput "signUpForm.passwordAgain" "class='form-control'"/>
                                            <#if passwordsErrorMessage??>
                                                <p class="error">${passwordsErrorMessage}</p>
                                            </#if>
                                        </div>
                                        <input type="submit" id="hide-submit" hidden>
                                        <button class="btn btn-primary btn-lg btn-block waves-effect waves-light" id="submit"><@spring.message 'sign_up_page.registration.title'/>
                                        </button>
                                    </form>
                                    <hr>
                                    <p><a href="/signIn" class="text-secondary"><@spring.message 'sign_in_page.authorization.title'/>?</a></p>
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