var LOGIN = {};

// 文字列定義
LOGIN.title = "";
LOGIN.description = "課題解決型アプリSportsNote(Web版)のログインページです。";
LOGIN.mailAddress = "";
LOGIN.password = "";

/* 初期化 */
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

    document.forms.loginForm.mail.value = LOGIN.mailAddress;
};

/*　ログインボタンの処理 */
LOGIN.actionLogin = function() {
    // 入力値を残す
    LOGIN.mailAddress = document.forms.loginForm.mail.value;
    LOGIN.password = document.forms.loginForm.password.value;

    // 入力チェック
    if (LOGIN.mailAddress == "" || LOGIN.password == "") {
        alert("メールアドレスまたはパスワードが入力されていません。");
        return;
    }

    // ログイン処理
    firebase.auth().signInWithEmailAndPassword(LOGIN.mailAddress, LOGIN.password)
    .then((userCredential) => {
        var user = userCredential.user;
        setTimeout(function() {
            window.location.href = './task_list.html';
        }, 100);
    })
    .catch((error) => {
        var errorCode = error.code;
        var errorMessage = error.message;
        alert(errorMessage);
    });
};

/*　パスワードリセットボタンの処理 */
LOGIN.actionPasswordReset = function() {
    // 入力値を残す
    LOGIN.mailAddress = document.forms.loginForm.mail.value;

    // 入力チェック
    if (LOGIN.mailAddress == "") {
        alert("メールアドレスが入力されていません。");
        return;
    }

    // パスワードリセットメール送信処理
    if (confirm('パスワードリセットメールを送信しますか？')) {
        
    }
};