/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat (TomEE)/7.0.37
 * Generated at: 2013-05-09 09:13:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class request_002dclaim_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_0026_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005flabel_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fvalue_005frows_005fname_005flabel_005fid_005fcols_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005fnamespace_005faction_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsj_005fa_0026_005frequestType_005fonSuccessTopics_005fid_005fhref_005fformIds_005fdataType_005fcssClass_005fbutton;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsj_005fa_0026_005ftargets_005frequestType_005fid_005fhref_005fcssClass_005fbutton;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fform_0026_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005flabel_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fvalue_005frows_005fname_005flabel_005fid_005fcols_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005fnamespace_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsj_005fa_0026_005frequestType_005fonSuccessTopics_005fid_005fhref_005fformIds_005fdataType_005fcssClass_005fbutton = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsj_005fa_0026_005ftargets_005frequestType_005fid_005fhref_005fcssClass_005fbutton = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fform_0026_005fid.release();
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005flabel_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fvalue_005frows_005fname_005flabel_005fid_005fcols_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005fnamespace_005faction_005fnobody.release();
    _005fjspx_005ftagPool_005fsj_005fa_0026_005frequestType_005fonSuccessTopics_005fid_005fhref_005fformIds_005fdataType_005fcssClass_005fbutton.release();
    _005fjspx_005ftagPool_005fsj_005fa_0026_005ftargets_005frequestType_005fid_005fhref_005fcssClass_005fbutton.release();
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
      out.write("<div id=\"newClaimRegion\">\r\n");
      out.write("\t<h1>Create claim</h1>\r\n");
      out.write("\t<hr />\r\n");
      out.write("\r\n");
      out.write("\t");
      if (_jspx_meth_s_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"newClaimFormButtons\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_s_005furl_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_s_005furl_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_sj_005fa_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_sj_005fa_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$('#newClaimButton')\r\n");
      out.write("\t\t\t\t.subscribe(\r\n");
      out.write("\t\t\t\t\t\t'CreateNewRequestSuccessTopic',\r\n");
      out.write("\t\t\t\t\t\tfunction(event, element) {\r\n");
      out.write("\t\t\t\t\t\t\tvar result = $\r\n");
      out.write("\t\t\t\t\t\t\t\t\t.parseJSON(event.originalEvent.request.responseText);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\tif (result.status === 'success') {\r\n");
      out.write("\t\t\t\t\t\t\t\tcommon.showInfoDialog(result.message,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t'Success', {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tOk : function() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$(this).dialog(\"close\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$('#cancelButton').click();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\tcommon.showInfoDialog(result.message, 'Error');\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("</script>");
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

  private boolean _jspx_meth_s_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f0 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005fid.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fform_005f0.setParent(null);
    // /jsp/request-claim.jsp(10,1) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setId("newClaimForm");
    int _jspx_eval_s_005fform_005f0 = _jspx_th_s_005fform_005f0.doStartTag();
    if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fform_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t<table>\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f1(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f2(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f3(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005ftextarea_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t</table>\r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_s_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fform_0026_005fid.reuse(_jspx_th_s_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fform_0026_005fid.reuse(_jspx_th_s_005fform_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f0 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005flabel_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /jsp/request-claim.jsp(12,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setId("amount");
    // /jsp/request-claim.jsp(12,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setName("claim.amount");
    // /jsp/request-claim.jsp(12,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setValue("%{claim.amount}");
    // /jsp/request-claim.jsp(12,3) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setLabel("Claim amount, $");
    int _jspx_eval_s_005ftextfield_005f0 = _jspx_th_s_005ftextfield_005f0.doStartTag();
    if (_jspx_th_s_005ftextfield_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005flabel_005fid_005fnobody.reuse(_jspx_th_s_005ftextfield_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005flabel_005fid_005fnobody.reuse(_jspx_th_s_005ftextfield_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f1 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005flabel_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /jsp/request-claim.jsp(14,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setId("period");
    // /jsp/request-claim.jsp(14,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setName("claim.period");
    // /jsp/request-claim.jsp(14,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setValue("%{claim.period}");
    // /jsp/request-claim.jsp(14,3) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setLabel("Claim period, months");
    int _jspx_eval_s_005ftextfield_005f1 = _jspx_th_s_005ftextfield_005f1.doStartTag();
    if (_jspx_th_s_005ftextfield_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005flabel_005fid_005fnobody.reuse(_jspx_th_s_005ftextfield_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005flabel_005fid_005fnobody.reuse(_jspx_th_s_005ftextfield_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f2 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005flabel_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /jsp/request-claim.jsp(16,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f2.setId("rate");
    // /jsp/request-claim.jsp(16,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f2.setName("claim.rate");
    // /jsp/request-claim.jsp(16,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f2.setValue("%{claim.rate}");
    // /jsp/request-claim.jsp(16,3) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f2.setLabel("Claim rate, %");
    int _jspx_eval_s_005ftextfield_005f2 = _jspx_th_s_005ftextfield_005f2.doStartTag();
    if (_jspx_th_s_005ftextfield_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005flabel_005fid_005fnobody.reuse(_jspx_th_s_005ftextfield_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005flabel_005fid_005fnobody.reuse(_jspx_th_s_005ftextfield_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f3 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005flabel_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /jsp/request-claim.jsp(18,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f3.setId("purpose");
    // /jsp/request-claim.jsp(18,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f3.setName("claim.purpose");
    // /jsp/request-claim.jsp(18,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f3.setValue("%{claim.purpose}");
    // /jsp/request-claim.jsp(18,3) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f3.setLabel("Claim purpose");
    int _jspx_eval_s_005ftextfield_005f3 = _jspx_th_s_005ftextfield_005f3.doStartTag();
    if (_jspx_th_s_005ftextfield_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005flabel_005fid_005fnobody.reuse(_jspx_th_s_005ftextfield_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005flabel_005fid_005fnobody.reuse(_jspx_th_s_005ftextfield_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005ftextarea_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:textarea
    org.apache.struts2.views.jsp.ui.TextareaTag _jspx_th_s_005ftextarea_005f0 = (org.apache.struts2.views.jsp.ui.TextareaTag) _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fvalue_005frows_005fname_005flabel_005fid_005fcols_005fnobody.get(org.apache.struts2.views.jsp.ui.TextareaTag.class);
    _jspx_th_s_005ftextarea_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextarea_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /jsp/request-claim.jsp(20,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f0.setId("description");
    // /jsp/request-claim.jsp(20,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f0.setName("claim.description");
    // /jsp/request-claim.jsp(20,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f0.setValue("%{claim.description}");
    // /jsp/request-claim.jsp(20,3) name = cols type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f0.setCols("40");
    // /jsp/request-claim.jsp(20,3) name = rows type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f0.setRows("10");
    // /jsp/request-claim.jsp(20,3) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f0.setLabel("Claim desciption");
    int _jspx_eval_s_005ftextarea_005f0 = _jspx_th_s_005ftextarea_005f0.doStartTag();
    if (_jspx_th_s_005ftextarea_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fvalue_005frows_005fname_005flabel_005fid_005fcols_005fnobody.reuse(_jspx_th_s_005ftextarea_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fvalue_005frows_005fname_005flabel_005fid_005fcols_005fnobody.reuse(_jspx_th_s_005ftextarea_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_005furl_005f0 = (org.apache.struts2.views.jsp.URLTag) _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005fnamespace_005faction_005fnobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005furl_005f0.setParent(null);
    // /jsp/request-claim.jsp(27,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f0.setVar("CreateNewRequestUrl");
    // /jsp/request-claim.jsp(27,2) name = namespace type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f0.setNamespace("/");
    // /jsp/request-claim.jsp(27,2) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f0.setAction("CreateNewRequest");
    int _jspx_eval_s_005furl_005f0 = _jspx_th_s_005furl_005f0.doStartTag();
    if (_jspx_th_s_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005fnamespace_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005fnamespace_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_005furl_005f1 = (org.apache.struts2.views.jsp.URLTag) _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005fnamespace_005faction_005fnobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005furl_005f1.setParent(null);
    // /jsp/request-claim.jsp(29,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f1.setVar("exitUrl");
    // /jsp/request-claim.jsp(29,2) name = namespace type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f1.setNamespace("/");
    // /jsp/request-claim.jsp(29,2) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f1.setAction("index");
    int _jspx_eval_s_005furl_005f1 = _jspx_th_s_005furl_005f1.doStartTag();
    if (_jspx_th_s_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005fnamespace_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005fnamespace_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_sj_005fa_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sj:a
    com.jgeppert.struts2.jquery.views.jsp.ui.AnchorTag _jspx_th_sj_005fa_005f0 = (com.jgeppert.struts2.jquery.views.jsp.ui.AnchorTag) _005fjspx_005ftagPool_005fsj_005fa_0026_005frequestType_005fonSuccessTopics_005fid_005fhref_005fformIds_005fdataType_005fcssClass_005fbutton.get(com.jgeppert.struts2.jquery.views.jsp.ui.AnchorTag.class);
    _jspx_th_sj_005fa_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sj_005fa_005f0.setParent(null);
    // /jsp/request-claim.jsp(30,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sj_005fa_005f0.setId("newClaimButton");
    // /jsp/request-claim.jsp(30,2) name = button type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sj_005fa_005f0.setButton("true");
    // /jsp/request-claim.jsp(30,2) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sj_005fa_005f0.setCssClass("btn");
    // /jsp/request-claim.jsp(30,2) name = formIds type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sj_005fa_005f0.setFormIds("newClaimForm");
    // /jsp/request-claim.jsp(30,2) name = href type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sj_005fa_005f0.setHref("%{CreateNewRequestUrl}");
    // /jsp/request-claim.jsp(30,2) name = requestType type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sj_005fa_005f0.setRequestType("POST");
    // /jsp/request-claim.jsp(30,2) name = dataType type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sj_005fa_005f0.setDataType("json");
    // /jsp/request-claim.jsp(30,2) name = onSuccessTopics type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sj_005fa_005f0.setOnSuccessTopics("CreateNewRequestSuccessTopic");
    int _jspx_eval_sj_005fa_005f0 = _jspx_th_sj_005fa_005f0.doStartTag();
    if (_jspx_eval_sj_005fa_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sj_005fa_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sj_005fa_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sj_005fa_005f0.doInitBody();
      }
      do {
        out.write("Create claim");
        int evalDoAfterBody = _jspx_th_sj_005fa_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sj_005fa_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_sj_005fa_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsj_005fa_0026_005frequestType_005fonSuccessTopics_005fid_005fhref_005fformIds_005fdataType_005fcssClass_005fbutton.reuse(_jspx_th_sj_005fa_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsj_005fa_0026_005frequestType_005fonSuccessTopics_005fid_005fhref_005fformIds_005fdataType_005fcssClass_005fbutton.reuse(_jspx_th_sj_005fa_005f0);
    return false;
  }

  private boolean _jspx_meth_sj_005fa_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sj:a
    com.jgeppert.struts2.jquery.views.jsp.ui.AnchorTag _jspx_th_sj_005fa_005f1 = (com.jgeppert.struts2.jquery.views.jsp.ui.AnchorTag) _005fjspx_005ftagPool_005fsj_005fa_0026_005ftargets_005frequestType_005fid_005fhref_005fcssClass_005fbutton.get(com.jgeppert.struts2.jquery.views.jsp.ui.AnchorTag.class);
    _jspx_th_sj_005fa_005f1.setPageContext(_jspx_page_context);
    _jspx_th_sj_005fa_005f1.setParent(null);
    // /jsp/request-claim.jsp(34,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sj_005fa_005f1.setId("cancelButton");
    // /jsp/request-claim.jsp(34,2) name = button type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sj_005fa_005f1.setButton("true");
    // /jsp/request-claim.jsp(34,2) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sj_005fa_005f1.setCssClass("btn");
    // /jsp/request-claim.jsp(34,2) name = href type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sj_005fa_005f1.setHref("%{exitUrl}");
    // /jsp/request-claim.jsp(34,2) name = requestType type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sj_005fa_005f1.setRequestType("POST");
    // /jsp/request-claim.jsp(34,2) name = targets type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sj_005fa_005f1.setTargets("main");
    int _jspx_eval_sj_005fa_005f1 = _jspx_th_sj_005fa_005f1.doStartTag();
    if (_jspx_eval_sj_005fa_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sj_005fa_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sj_005fa_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sj_005fa_005f1.doInitBody();
      }
      do {
        out.write("Cancel");
        int evalDoAfterBody = _jspx_th_sj_005fa_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sj_005fa_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_sj_005fa_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsj_005fa_0026_005ftargets_005frequestType_005fid_005fhref_005fcssClass_005fbutton.reuse(_jspx_th_sj_005fa_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fsj_005fa_0026_005ftargets_005frequestType_005fid_005fhref_005fcssClass_005fbutton.reuse(_jspx_th_sj_005fa_005f1);
    return false;
  }
}
