package com.ctrip.jmeter.utils;

import org.apache.jmeter.protocol.http.sampler.HTTPJavaImpl;
import org.apache.jmeter.protocol.http.sampler.HTTPSampleResult;
import org.apache.jmeter.protocol.http.sampler.HTTPSamplerBase;
import org.apache.jmeter.util.SSLManager;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JavaHttpImpl {
    private static final Logger log = LoggerFactory.getLogger(JavaHttpImpl.class);


//    public HttpURLConnection setupConnection(URL u, String method, HTTPSampleResult res) throws IOException {
//        SSLManager sslmgr = null;
//        if ("https".equalsIgnoreCase(u.getProtocol())) {
//            try {
//                sslmgr = SSLManager.getInstance();
//            } catch (Exception var13) {
//                log.warn("Problem creating the SSLManager: ", var13);
//            }
//        }
//
//        String proxyHost = this.getProxyHost();
//        int proxyPort = this.getProxyPortInt();
//        HttpURLConnection conn;
//        if (proxyHost.length() > 0 && proxyPort > 0) {
//            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyHost, proxyPort));
//            conn = (HttpURLConnection) u.openConnection(proxy);
//        } else {
//            conn = (HttpURLConnection) u.openConnection();
//        }
//
//        conn.setInstanceFollowRedirects(this.getAutoRedirects());
//        int cto = this.getConnectTimeout();
//        if (cto > 0) {
//            conn.setConnectTimeout(cto);
//        }
//
//        int rto = this.getResponseTimeout();
//        if (rto > 0) {
//            conn.setReadTimeout(rto);
//        }
//
//        if ("https".equalsIgnoreCase(u.getProtocol())) {
//            try {
//                if (null != sslmgr) {
//                    sslmgr.setContext(conn);
//                }
//            } catch (Exception var12) {
//                log.warn("Problem setting the SSLManager for the connection: ", var12);
//            }
//        }
//
//        if (this.getUseKeepAlive()) {
//            conn.setRequestProperty("Connection", "keep-alive");
//        } else {
//            conn.setRequestProperty("Connection", "close");
//        }
//
//        conn.setRequestMethod(method);
//        this.setConnectionHeaders(conn, u, this.getHeaderManager(), this.getCacheManager());
//        String cookies = this.setConnectionCookie(conn, u, this.getCookieManager());
//        Map<String, String> securityHeaders = this.setConnectionAuthorization(conn, u, this.getAuthManager());
//        if (method.equals("POST")) {
//            this.setPostHeaders(conn);
//        } else if (method.equals("PUT")) {
//            this.setPutHeaders(conn);
//        }
//
//        if (res != null) {
//            res.setRequestHeaders(this.getConnectionHeaders(conn, securityHeaders));
//            res.setCookies(cookies);
//        }
//        return conn;
//    }
}
