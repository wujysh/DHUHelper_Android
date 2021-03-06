package org.sjutas.dhu.net;

/**
 * @author wujy 网络相关的一些常量
 */
public interface NetConstant {
	int CJCX_HOMEPAGE = 2000; // 成绩查询
	int CJCX_SEARCH = 2001;

	int CJDCX_HOMEPAGE = 6000; // 个人成绩单
	int CJDCX_SEARCH = 6001;

	int JDCX_HOMEPAGE = 7000; // 绩点查询
	int JDCX_SEARCH = 7001;

	int KCCX_HOMEPAGE = 8000; // 考场查询
	int KCCX_BK_HOMEPAGE = 8001;
	int KCCX_BK_SCORE = 8002;

	int TIMETABLE = 6500;
	int COMMON_QUERY = 6600;

	int HOMEPAGE = 9999; // 首页

	int NEWS_JWXX = 9997; // 新闻公告
	int NEWS_DHXW = 9996;
	int NEWS_XNGG = 9995;
	int NEWS_DETAIL = 9990;
	int NEWS_DETAIL_JW = 9989;

	int XKCX_HOMEPAGE = 4000; // 选课
	int XKCX_INFO = 4001;
    int XKCX_SEARCH = 4002;
	int MONITOR = 4003;

	int INFO_HOMEPAGE = 5000; // 个人信息查看
	int LOGIN = 1000; // 登录
	int UPDATE = 9998; // 检查更新

	int BOOK_BORROW = 7500;
	int BOOK_SEARCH = 7600;

    int RUNNING_LOGIN = 7700;
    int RUNNING_QUERY = 7800;

    int MEETING_INFO = 7900;

	int MSG_NET_LOADING = 10;
	int MSG_NET_ERROR = 3;
	int MSG_NONE_NET = 2;
	int MSG_OTHER_ERROR = 99;
	int MSG_PASSWORD_ERROR = 4;
	int MSG_REFRESH = 0;
	int MSG_SERVER_ERROR = 1;

	int TYPE_GET = 1;
	int TYPE_POST = 2;

	String URL_CJCX = "http://jw.dhu.edu.cn/dhu/student/query/scorequery_1.jsp";
	String URL_CJCX_ALL = "http://jw.dhu.edu.cn/dhu/student/query/scorequery.jsp?studentId=null";

	String URL_CJDCX = "http://jw.dhu.edu.cn/dhu/admin/score/classscorelist.jsp";

	String URL_JDCX = "http://jw.dhu.edu.cn/dhu/student/query/scorepoint.jsp";

	String URL_KCCX = "http://jw.dhu.edu.cn/dhu/student/query/examquery.jsp";
	String URL_KCCX_BK = "http://jw.dhu.edu.cn/dhu/student/query/examquery2.jsp";
	String URL_CJCX_BK = "http://jw.dhu.edu.cn/dhu/student/nopassScore/index.jsp";

	String URL_HOMEPAGE = "http://jw.dhu.edu.cn/dhu/";

	String URL_NEWS_JWXX = "http://jw.dhu.edu.cn/dhu/homepage/page/list_news.jsp?target=&pageSize=18&curPage=1";
	String URL_NEWS_XNGG = "http://www2.dhu.edu.cn/dhuxxxt/xinwenwang/xngg.asp";
	String URL_NEWS_DHXW = "http://www2.dhu.edu.cn/dhuxxxt/xinwenwang/dhxw.asp";

	String URL_INFO = "http://jw.dhu.edu.cn/dhu/student/modifyselfinfo.jsp";

	String URL_UPDATE = "http://hi.baidu.com/wujysh/item/85d9da8f4e6f825d27ebd957";

	String URL_XSCX = "http://jw.dhu.edu.cn/dhu/student/modifyselfinfo.jsp";

	String URL_LOGIN_JW = "http://jw.dhu.edu.cn/dhu/login_zh.jsp";
	String URL_LOGIN_LIB = "http://202.120.146.14:8080/reader/redr_verify.php";

	String URL_TIMETABLE = "http://jw.dhu.edu.cn/dhu/student/studentcoursetable.jsp";

	String URL_COMMON_QUERY = "http://jw.dhu.edu.cn/dhu/commonquery/";

	//String URL_COURSE_CHOOSE = "http://jw.dhu.edu.cn/dhu/student/selectcourse/selectcourse.jsp";
    String URL_COURSE_CHOOSE = "http://jw.dhu.edu.cn/dhu/student/selectcourse/selectCourse_ts.jsp";
	String URL_COURSE_SELECTED = "http://jw.dhu.edu.cn/dhu/student/selectcourse/seeselectedcourse.jsp";
	// String URL_COURSE_SEARCH =
	// "http://hi.baidu.com/wujysh/item/85d9da8f4e6f825d27ebd957";
	String URL_COURSE_SEARCH = "http://jw.dhu.edu.cn/dhu/student/selectcourse/selectcourse2.jsp";

	String URL_BOOK_SEARCH = "http://202.120.146.14:8080/opac/search.php";
	String URL_BOOK_BORROW = "http://202.120.146.14:8080/reader/book_lst.php";

    String URL_MEETING_INFO = "http://www.pupu333.com/forum.php?mod=viewthread&action=printable&tid=112&mobile=no";
            //http://www.pupu333.com/forum.php?mod=viewthread&tid=112&mobile=yes";

    String URL_RUNNING_LOGIN = "http://218.193.151.40/student/checkUser.jsp";
    String URL_RUNNING_QUERY = "http://218.193.151.40/student/queryExerInfo.jsp";

}
