/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat (TomEE)/7.0.37
 * Generated at: 2013-05-15 19:38:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class common_002dpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005furl_0026_005fnamespace_005faction_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005fnamespace_005faction_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsj_005fdiv_0026_005frequestType_005fonErrorTopics_005fid_005fhref_005fdataType;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005furl_0026_005fnamespace_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005fnamespace_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsj_005fdiv_0026_005frequestType_005fonErrorTopics_005fid_005fhref_005fdataType = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005furl_0026_005fnamespace_005faction_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005fnamespace_005faction_005fnobody.release();
    _005fjspx_005ftagPool_005fsj_005fdiv_0026_005frequestType_005fonErrorTopics_005fid_005fhref_005fdataType.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "common-page-head.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\tcommon.ajaxClick(\"NewClaimMenuItem\",\r\n");
      out.write("\t\t\t\t\"");
      if (_jspx_meth_s_005furl_005f0(_jspx_page_context))
        return;
      out.write("\",\r\n");
      out.write("\t\t\t\t\"main\", \"errorState\", \"indicatorMain\");\r\n");
      out.write("\t\tcommon.ajaxClick(\"ListMyClaimsMenuItem\",\r\n");
      out.write("\t\t\t\t\"");
      if (_jspx_meth_s_005furl_005f1(_jspx_page_context))
        return;
      out.write("\", \"main\",\r\n");
      out.write("\t\t\t\t\"errorState\", \"indicatorMain\");\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"navbar navbar-inverse navbar-fixed-top\">\r\n");
      out.write("\t\t<div class=\"navbar-inner\">\r\n");
      out.write("\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t\t<a class=\"brand\" href=\"#\">Javamates</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t<div class=\"span3\">\r\n");
      out.write("\t\t\t\t<div class=\"well sidebar-nav\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav nav-list\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-header\">Claims</li>\r\n");
      out.write("\t\t\t\t\t\t<li id=\"NewClaimMenuItem\"><a href=\"javascript:void(0)\">New\r\n");
      out.write("\t\t\t\t\t\t\t\tclaim</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li id=\"ListMyClaimsMenuItem\"><a href=\"javascript:void(0)\">My\r\n");
      out.write("\t\t\t\t\t\t\t\tclaims</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-header\">Offers</li>\r\n");
      out.write("\t\t\t\t\t\t<li id=\"CreateNewOfferMenuItem\">New offer</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"span9\">\r\n");
      out.write("\t\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_s_005furl_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_sj_005fdiv_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_005furl_005f0 = (org.apache.struts2.views.jsp.URLTag) _005fjspx_005ftagPool_005fs_005furl_0026_005fnamespace_005faction_005fnobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005furl_005f0.setParent(null);
    // /jsp/common-page.jsp(13,5) name = namespace type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f0.setNamespace("/");
    // /jsp/common-page.jsp(13,5) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f0.setAction("PrepareRequestForClaim");
    int _jspx_eval_s_005furl_005f0 = _jspx_th_s_005furl_005f0.doStartTag();
    if (_jspx_th_s_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005furl_0026_005fnamespace_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005furl_0026_005fnamespace_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_005furl_005f1 = (org.apache.struts2.views.jsp.URLTag) _005fjspx_005ftagPool_005fs_005furl_0026_005fnamespace_005faction_005fnobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005furl_005f1.setParent(null);
    // /jsp/common-page.jsp(16,5) name = namespace type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f1.setNamespace("/");
    // /jsp/common-page.jsp(16,5) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f1.setAction("ListActiveClaims");
    int _jspx_eval_s_005furl_005f1 = _jspx_th_s_005furl_005f1.doStartTag();
    if (_jspx_th_s_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005furl_0026_005fnamespace_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005furl_0026_005fnamespace_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005furl_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_005furl_005f2 = (org.apache.struts2.views.jsp.URLTag) _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005fnamespace_005faction_005fnobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005furl_005f2.setParent(null);
    // /jsp/common-page.jsp(48,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f2.setVar("ViewDefaultUrl");
    // /jsp/common-page.jsp(48,5) name = namespace type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f2.setNamespace("/");
    // /jsp/common-page.jsp(48,5) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f2.setAction("index");
    int _jspx_eval_s_005furl_005f2 = _jspx_th_s_005furl_005f2.doStartTag();
    if (_jspx_th_s_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005fnamespace_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005fnamespace_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f2);
    return false;
  }

  private boolean _jspx_meth_sj_005fdiv_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sj:div
    com.jgeppert.struts2.jquery.views.jsp.ui.DivTag _jspx_th_sj_005fdiv_005f0 = (com.jgeppert.struts2.jquery.views.jsp.ui.DivTag) _005fjspx_005ftagPool_005fsj_005fdiv_0026_005frequestType_005fonErrorTopics_005fid_005fhref_005fdataType.get(com.jgeppert.struts2.jquery.views.jsp.ui.DivTag.class);
    _jspx_th_sj_005fdiv_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sj_005fdiv_005f0.setParent(null);
    // /jsp/common-page.jsp(49,5) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sj_005fdiv_005f0.setId("main");
    // /jsp/common-page.jsp(49,5) name = onErrorTopics type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sj_005fdiv_005f0.setOnErrorTopics("errorState");
    // /jsp/common-page.jsp(49,5) name = dataType type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sj_005fdiv_005f0.setDataType("html");
    // /jsp/common-page.jsp(49,5) name = requestType type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sj_005fdiv_005f0.setRequestType("POST");
    // /jsp/common-page.jsp(49,5) name = href type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sj_005fdiv_005f0.setHref("%{ViewDefaultUrl}");
    int _jspx_eval_sj_005fdiv_005f0 = _jspx_th_sj_005fdiv_005f0.doStartTag();
    if (_jspx_eval_sj_005fdiv_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sj_005fdiv_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sj_005fdiv_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sj_005fdiv_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_sj_005fdiv_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sj_005fdiv_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_sj_005fdiv_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsj_005fdiv_0026_005frequestType_005fonErrorTopics_005fid_005fhref_005fdataType.reuse(_jspx_th_sj_005fdiv_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsj_005fdiv_0026_005frequestType_005fonErrorTopics_005fid_005fhref_005fdataType.reuse(_jspx_th_sj_005fdiv_005f0);
    return false;
  }
}
