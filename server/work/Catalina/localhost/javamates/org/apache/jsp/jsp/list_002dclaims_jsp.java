/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat (TomEE)/7.0.37
 * Generated at: 2013-05-09 09:13:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_002dclaims_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005fnamespace_005faction_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsjg_005fgrid_0026_005fshrinkToFit_005fhref_005fhiddengrid_005fgridModel_005fcssStyle_005fautowidth;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005ftitle_005fname_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005fnamespace_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsjg_005fgrid_0026_005fshrinkToFit_005fhref_005fhiddengrid_005fgridModel_005fcssStyle_005fautowidth = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005ftitle_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005fnamespace_005faction_005fnobody.release();
    _005fjspx_005ftagPool_005fsjg_005fgrid_0026_005fshrinkToFit_005fhref_005fhiddengrid_005fgridModel_005fcssStyle_005fautowidth.release();
    _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005ftitle_005fname_005fnobody.release();
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
      out.write("\r\n");
      out.write("<div id=\"claimsRegion\">\r\n");
      out.write("\t<h1>List of active claims</h1>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"gridRegion\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_s_005furl_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_sjg_005fgrid_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>");
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
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_005furl_005f0 = (org.apache.struts2.views.jsp.URLTag) _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005fnamespace_005faction_005fnobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005furl_005f0.setParent(null);
    // /jsp/list-claims.jsp(11,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f0.setVar("gridDataUrl");
    // /jsp/list-claims.jsp(11,2) name = namespace type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f0.setNamespace("/");
    // /jsp/list-claims.jsp(11,2) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f0.setAction("ListActiveClaimsGrid");
    int _jspx_eval_s_005furl_005f0 = _jspx_th_s_005furl_005f0.doStartTag();
    if (_jspx_th_s_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005fnamespace_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005fnamespace_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_sjg_005fgrid_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sjg:grid
    com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridTag _jspx_th_sjg_005fgrid_005f0 = (com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridTag) _005fjspx_005ftagPool_005fsjg_005fgrid_0026_005fshrinkToFit_005fhref_005fhiddengrid_005fgridModel_005fcssStyle_005fautowidth.get(com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridTag.class);
    _jspx_th_sjg_005fgrid_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sjg_005fgrid_005f0.setParent(null);
    // /jsp/list-claims.jsp(12,2) name = gridModel type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgrid_005f0.setGridModel("claims");
    // /jsp/list-claims.jsp(12,2) name = href type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgrid_005f0.setHref("%{gridDataUrl}");
    // /jsp/list-claims.jsp(12,2) name = shrinkToFit type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgrid_005f0.setShrinkToFit("true");
    // /jsp/list-claims.jsp(12,2) name = autowidth type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgrid_005f0.setAutowidth("true");
    // /jsp/list-claims.jsp(12,2) name = hiddengrid type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgrid_005f0.setHiddengrid("true");
    // /jsp/list-claims.jsp(12,2) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgrid_005f0.setCssStyle("font: 12px 'HelveticaNeue'; letter-spacing: 0.6px;");
    int _jspx_eval_sjg_005fgrid_005f0 = _jspx_th_sjg_005fgrid_005f0.doStartTag();
    if (_jspx_eval_sjg_005fgrid_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sjg_005fgrid_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sjg_005fgrid_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sjg_005fgrid_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_sjg_005fgridColumn_005f0(_jspx_th_sjg_005fgrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_sjg_005fgridColumn_005f1(_jspx_th_sjg_005fgrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_sjg_005fgridColumn_005f2(_jspx_th_sjg_005fgrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_sjg_005fgridColumn_005f3(_jspx_th_sjg_005fgrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_sjg_005fgridColumn_005f4(_jspx_th_sjg_005fgrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_sjg_005fgridColumn_005f5(_jspx_th_sjg_005fgrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_sjg_005fgridColumn_005f6(_jspx_th_sjg_005fgrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_sjg_005fgridColumn_005f7(_jspx_th_sjg_005fgrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_sjg_005fgrid_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sjg_005fgrid_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_sjg_005fgrid_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsjg_005fgrid_0026_005fshrinkToFit_005fhref_005fhiddengrid_005fgridModel_005fcssStyle_005fautowidth.reuse(_jspx_th_sjg_005fgrid_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsjg_005fgrid_0026_005fshrinkToFit_005fhref_005fhiddengrid_005fgridModel_005fcssStyle_005fautowidth.reuse(_jspx_th_sjg_005fgrid_005f0);
    return false;
  }

  private boolean _jspx_meth_sjg_005fgridColumn_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_sjg_005fgrid_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sjg:gridColumn
    com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag _jspx_th_sjg_005fgridColumn_005f0 = (com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag) _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005ftitle_005fname_005fnobody.get(com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag.class);
    _jspx_th_sjg_005fgridColumn_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sjg_005fgridColumn_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sjg_005fgrid_005f0);
    // /jsp/list-claims.jsp(15,3) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f0.setName("id");
    // /jsp/list-claims.jsp(15,3) name = title type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f0.setTitle("ID");
    int _jspx_eval_sjg_005fgridColumn_005f0 = _jspx_th_sjg_005fgridColumn_005f0.doStartTag();
    if (_jspx_th_sjg_005fgridColumn_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005ftitle_005fname_005fnobody.reuse(_jspx_th_sjg_005fgridColumn_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005ftitle_005fname_005fnobody.reuse(_jspx_th_sjg_005fgridColumn_005f0);
    return false;
  }

  private boolean _jspx_meth_sjg_005fgridColumn_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_sjg_005fgrid_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sjg:gridColumn
    com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag _jspx_th_sjg_005fgridColumn_005f1 = (com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag) _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005ftitle_005fname_005fnobody.get(com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag.class);
    _jspx_th_sjg_005fgridColumn_005f1.setPageContext(_jspx_page_context);
    _jspx_th_sjg_005fgridColumn_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sjg_005fgrid_005f0);
    // /jsp/list-claims.jsp(16,3) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f1.setName("createDate");
    // /jsp/list-claims.jsp(16,3) name = title type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f1.setTitle("Creation date");
    int _jspx_eval_sjg_005fgridColumn_005f1 = _jspx_th_sjg_005fgridColumn_005f1.doStartTag();
    if (_jspx_th_sjg_005fgridColumn_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005ftitle_005fname_005fnobody.reuse(_jspx_th_sjg_005fgridColumn_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005ftitle_005fname_005fnobody.reuse(_jspx_th_sjg_005fgridColumn_005f1);
    return false;
  }

  private boolean _jspx_meth_sjg_005fgridColumn_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_sjg_005fgrid_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sjg:gridColumn
    com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag _jspx_th_sjg_005fgridColumn_005f2 = (com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag) _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005ftitle_005fname_005fnobody.get(com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag.class);
    _jspx_th_sjg_005fgridColumn_005f2.setPageContext(_jspx_page_context);
    _jspx_th_sjg_005fgridColumn_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sjg_005fgrid_005f0);
    // /jsp/list-claims.jsp(17,3) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f2.setName("amount");
    // /jsp/list-claims.jsp(17,3) name = title type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f2.setTitle("Claim amount");
    int _jspx_eval_sjg_005fgridColumn_005f2 = _jspx_th_sjg_005fgridColumn_005f2.doStartTag();
    if (_jspx_th_sjg_005fgridColumn_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005ftitle_005fname_005fnobody.reuse(_jspx_th_sjg_005fgridColumn_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005ftitle_005fname_005fnobody.reuse(_jspx_th_sjg_005fgridColumn_005f2);
    return false;
  }

  private boolean _jspx_meth_sjg_005fgridColumn_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_sjg_005fgrid_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sjg:gridColumn
    com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag _jspx_th_sjg_005fgridColumn_005f3 = (com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag) _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005ftitle_005fname_005fnobody.get(com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag.class);
    _jspx_th_sjg_005fgridColumn_005f3.setPageContext(_jspx_page_context);
    _jspx_th_sjg_005fgridColumn_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sjg_005fgrid_005f0);
    // /jsp/list-claims.jsp(18,3) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f3.setName("rate");
    // /jsp/list-claims.jsp(18,3) name = title type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f3.setTitle("Rate");
    int _jspx_eval_sjg_005fgridColumn_005f3 = _jspx_th_sjg_005fgridColumn_005f3.doStartTag();
    if (_jspx_th_sjg_005fgridColumn_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005ftitle_005fname_005fnobody.reuse(_jspx_th_sjg_005fgridColumn_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005ftitle_005fname_005fnobody.reuse(_jspx_th_sjg_005fgridColumn_005f3);
    return false;
  }

  private boolean _jspx_meth_sjg_005fgridColumn_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_sjg_005fgrid_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sjg:gridColumn
    com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag _jspx_th_sjg_005fgridColumn_005f4 = (com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag) _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005ftitle_005fname_005fnobody.get(com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag.class);
    _jspx_th_sjg_005fgridColumn_005f4.setPageContext(_jspx_page_context);
    _jspx_th_sjg_005fgridColumn_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sjg_005fgrid_005f0);
    // /jsp/list-claims.jsp(19,3) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f4.setName("period");
    // /jsp/list-claims.jsp(19,3) name = title type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f4.setTitle("Payment months count");
    int _jspx_eval_sjg_005fgridColumn_005f4 = _jspx_th_sjg_005fgridColumn_005f4.doStartTag();
    if (_jspx_th_sjg_005fgridColumn_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005ftitle_005fname_005fnobody.reuse(_jspx_th_sjg_005fgridColumn_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005ftitle_005fname_005fnobody.reuse(_jspx_th_sjg_005fgridColumn_005f4);
    return false;
  }

  private boolean _jspx_meth_sjg_005fgridColumn_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_sjg_005fgrid_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sjg:gridColumn
    com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag _jspx_th_sjg_005fgridColumn_005f5 = (com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag) _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005ftitle_005fname_005fnobody.get(com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag.class);
    _jspx_th_sjg_005fgridColumn_005f5.setPageContext(_jspx_page_context);
    _jspx_th_sjg_005fgridColumn_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sjg_005fgrid_005f0);
    // /jsp/list-claims.jsp(20,3) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f5.setName("state");
    // /jsp/list-claims.jsp(20,3) name = title type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f5.setTitle("State");
    int _jspx_eval_sjg_005fgridColumn_005f5 = _jspx_th_sjg_005fgridColumn_005f5.doStartTag();
    if (_jspx_th_sjg_005fgridColumn_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005ftitle_005fname_005fnobody.reuse(_jspx_th_sjg_005fgridColumn_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005ftitle_005fname_005fnobody.reuse(_jspx_th_sjg_005fgridColumn_005f5);
    return false;
  }

  private boolean _jspx_meth_sjg_005fgridColumn_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_sjg_005fgrid_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sjg:gridColumn
    com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag _jspx_th_sjg_005fgridColumn_005f6 = (com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag) _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005ftitle_005fname_005fnobody.get(com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag.class);
    _jspx_th_sjg_005fgridColumn_005f6.setPageContext(_jspx_page_context);
    _jspx_th_sjg_005fgridColumn_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sjg_005fgrid_005f0);
    // /jsp/list-claims.jsp(21,3) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f6.setName("purpose");
    // /jsp/list-claims.jsp(21,3) name = title type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f6.setTitle("Purpose");
    int _jspx_eval_sjg_005fgridColumn_005f6 = _jspx_th_sjg_005fgridColumn_005f6.doStartTag();
    if (_jspx_th_sjg_005fgridColumn_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005ftitle_005fname_005fnobody.reuse(_jspx_th_sjg_005fgridColumn_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005ftitle_005fname_005fnobody.reuse(_jspx_th_sjg_005fgridColumn_005f6);
    return false;
  }

  private boolean _jspx_meth_sjg_005fgridColumn_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_sjg_005fgrid_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sjg:gridColumn
    com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag _jspx_th_sjg_005fgridColumn_005f7 = (com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag) _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005ftitle_005fname_005fnobody.get(com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag.class);
    _jspx_th_sjg_005fgridColumn_005f7.setPageContext(_jspx_page_context);
    _jspx_th_sjg_005fgridColumn_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sjg_005fgrid_005f0);
    // /jsp/list-claims.jsp(22,3) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f7.setName("description");
    // /jsp/list-claims.jsp(22,3) name = title type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f7.setTitle("Description");
    int _jspx_eval_sjg_005fgridColumn_005f7 = _jspx_th_sjg_005fgridColumn_005f7.doStartTag();
    if (_jspx_th_sjg_005fgridColumn_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005ftitle_005fname_005fnobody.reuse(_jspx_th_sjg_005fgridColumn_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005ftitle_005fname_005fnobody.reuse(_jspx_th_sjg_005fgridColumn_005f7);
    return false;
  }
}