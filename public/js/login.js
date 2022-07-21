var LOGIN = {};

// 文字列定義
LOGIN.title = "";
LOGIN.description = "課題解決型アプリSportsNote(Web版)のログインページです。";

// 初期化
LOGIN.init = function() {
    // ページ情報設定
    LOGIN.title = "ログイン｜" + COM.appName;
    document.title = LOGIN.title;
    document.querySelector('meta[name="description"]').setAttribute("content", LOGIN.description);
    document.querySelector('meta[property="og:title"]').setAttribute("content", LOGIN.title);
    document.querySelector('meta[property="og:description"]').setAttribute("content", LOGIN.description);
    document.querySelector('meta[property="og:type"]').setAttribute("content", "website");
    document.querySelector('meta[property="og:url"]').setAttribute("content", "");
    document.querySelector('meta[property="og:image"]').setAttribute("content", COM.appImagePath);
    document.querySelector('meta[property="og:site_name"]').setAttribute("content", COM.appName);

    // 処理
    
};