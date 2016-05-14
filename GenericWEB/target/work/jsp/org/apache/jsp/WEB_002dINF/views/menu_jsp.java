package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sec_authorize_access;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sec_authentication_var_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_sec_authorize_access = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sec_authentication_var_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_sec_authorize_access.release();
    _jspx_tagPool_c_url_value_nobody.release();
    _jspx_tagPool_sec_authentication_var_property_nobody.release();
    _jspx_tagPool_c_out_value_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h2>Menu</h2>\r\n");
      if (_jspx_meth_sec_authorize_0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_sec_authorize_1(_jspx_page_context))
        return;
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_sec_authorize_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_authorize_0 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _jspx_tagPool_sec_authorize_access.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_sec_authorize_0.setPageContext(_jspx_page_context);
    _jspx_th_sec_authorize_0.setParent(null);
    _jspx_th_sec_authorize_0.setAccess("!isAuthenticated()");
    int _jspx_eval_sec_authorize_0 = _jspx_th_sec_authorize_0.doStartTag();
    if (_jspx_eval_sec_authorize_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n");
      out.write("\tPor favor inicie sesion\r\n");
      out.write("\t<a href=\"");
      if (_jspx_meth_c_url_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_sec_authorize_0, _jspx_page_context))
        return true;
      out.write("\">Acceder</a>\r\n");
    }
    if (_jspx_th_sec_authorize_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sec_authorize_access.reuse(_jspx_th_sec_authorize_0);
      return true;
    }
    _jspx_tagPool_sec_authorize_access.reuse(_jspx_th_sec_authorize_0);
    return false;
  }

  private boolean _jspx_meth_c_url_0(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_authorize_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_authorize_0);
    _jspx_th_c_url_0.setValue("/login");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_sec_authorize_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_authorize_1 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _jspx_tagPool_sec_authorize_access.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_sec_authorize_1.setPageContext(_jspx_page_context);
    _jspx_th_sec_authorize_1.setParent(null);
    _jspx_th_sec_authorize_1.setAccess("isAuthenticated()");
    int _jspx_eval_sec_authorize_1 = _jspx_th_sec_authorize_1.doStartTag();
    if (_jspx_eval_sec_authorize_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n");
      out.write("\t");
      if (_jspx_meth_sec_authentication_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_sec_authorize_1, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\tBienvenido: ");
      if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_sec_authorize_1, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t<a href=\"");
      if (_jspx_meth_c_url_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_sec_authorize_1, _jspx_page_context))
        return true;
      out.write("\">Logout</a>\r\n");
    }
    if (_jspx_th_sec_authorize_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sec_authorize_access.reuse(_jspx_th_sec_authorize_1);
      return true;
    }
    _jspx_tagPool_sec_authorize_access.reuse(_jspx_th_sec_authorize_1);
    return false;
  }

  private boolean _jspx_meth_sec_authentication_0(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_authorize_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authentication
    org.springframework.security.taglibs.authz.AuthenticationTag _jspx_th_sec_authentication_0 = (org.springframework.security.taglibs.authz.AuthenticationTag) _jspx_tagPool_sec_authentication_var_property_nobody.get(org.springframework.security.taglibs.authz.AuthenticationTag.class);
    _jspx_th_sec_authentication_0.setPageContext(_jspx_page_context);
    _jspx_th_sec_authentication_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_authorize_1);
    _jspx_th_sec_authentication_0.setProperty("principal");
    _jspx_th_sec_authentication_0.setVar("principal");
    int _jspx_eval_sec_authentication_0 = _jspx_th_sec_authentication_0.doStartTag();
    if (_jspx_th_sec_authentication_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sec_authentication_var_property_nobody.reuse(_jspx_th_sec_authentication_0);
      return true;
    }
    _jspx_tagPool_sec_authentication_var_property_nobody.reuse(_jspx_th_sec_authentication_0);
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_authorize_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_authorize_1);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${principal.username}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_url_1(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_authorize_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_authorize_1);
    _jspx_th_c_url_1.setValue("/logout");
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
    return false;
  }
}
