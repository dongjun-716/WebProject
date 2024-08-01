<!doctype html>
<html><head><title data-rh="true">[Github] 사용법</title><link data-rh="true" rel="canonical" href="https://velog.io/@eldoradodo/an96ydx7"/><meta data-rh="true" property="fb:app_id" content="203040656938507"/><meta data-rh="true" name="description" content="고학년이 되고서 프로젝트의 규모가 커지기도 하고 장차 다인원 프로젝트를 진행하게 되었을 때를 대비하여 깃허브 및 깃허브 데스크 탑의 사용을 보다 더 유연하게 하고자 작성하게 되었다.항상 여러 부분에서 헷갈려 하면서 업로드하곤 하였는데 정리 겸 작성해보려 한다.1.Git"/><meta data-rh="true" property="og:url" content="https://velog.io/@eldoradodo/an96ydx7"/><meta data-rh="true" property="og:type" content="article"/><meta data-rh="true" property="og:title" content="[Github] 사용법"/><meta data-rh="true" property="og:description" content="고학년이 되고서 프로젝트의 규모가 커지기도 하고 장차 다인원 프로젝트를 진행하게 되었을 때를 대비하여 깃허브 및 깃허브 데스크 탑의 사용을 보다 더 유연하게 하고자 작성하게 되었다.항상 여러 부분에서 헷갈려 하면서 업로드하곤 하였는데 정리 겸 작성해보려 한다.1.Git"/><meta data-rh="true" property="og:image" content="https://velog.velcdn.com/images/eldoradodo/post/6ece1985-708f-469c-ace8-d45fc40c9874/image.png"/><meta data-rh="true" name="twitter:card" content="summary_large_image"/><meta data-rh="true" name="twitter:title" content="[Github] 사용법"/><meta data-rh="true" name="twitter:description" content="고학년이 되고서 프로젝트의 규모가 커지기도 하고 장차 다인원 프로젝트를 진행하게 되었을 때를 대비하여 깃허브 및 깃허브 데스크 탑의 사용을 보다 더 유연하게 하고자 작성하게 되었다.항상 여러 부분에서 헷갈려 하면서 업로드하곤 하였는데 정리 겸 작성해보려 한다.1.Git"/><meta data-rh="true" name="twitter:image" content="https://velog.velcdn.com/images/eldoradodo/post/6ece1985-708f-469c-ace8-d45fc40c9874/image.png"/><style data-styled="" data-styled-version="5.3.3">.hSMJOX{display:-webkit-inline-box;display:-webkit-inline-flex;display:-ms-inline-flexbox;display:inline-flex;-webkit-align-items:center;-webkit-box-align:center;-ms-flex-align:center;align-items:center;-webkit-box-pack:center;-webkit-justify-content:center;-ms-flex-pack:center;justify-content:center;font-weight:bold;cursor:pointer;outline:none;border:none;color:white;background:var(--primary1);color:var(--button-text);border-radius:4px;padding-top:0;padding-bottom:0;height:2rem;padding-left:1.25rem;padding-right:1.25rem;font-size:1rem;}/*!sc*/
.hSMJOX:hover,.hSMJOX:focus{background:var(--primary2);}/*!sc*/
.sc-jrQzAO + .sc-jrQzAO{margin-left:0.5rem;}/*!sc*/
.hSMJOX:disabled{cursor:not-allowed;background:var(--bg-element4);color:var(--text3);}/*!sc*/
.hSMJOX:disabled:hover{background:var(--bg-element4);color:var(--text3);}/*!sc*/
data-styled.g11[id="sc-jrQzAO"]{content:"hSMJOX,"}/*!sc*/
body{margin:0;padding:0;font-family:-apple-system,BlinkMacSystemFont,"Helvetica Neue","Apple SD Gothic Neo","Malgun Gothic","맑은 고딕",나눔고딕,"Nanum Gothic","Noto Sans KR","Noto Sans CJK KR",arial,돋움,Dotum,Tahoma,Geneva,sans-serif;-webkit-font-smoothing:antialiased;-moz-osx-font-smoothing:grayscale;color:var(--text1);box-sizing:border-box;}/*!sc*/
*{box-sizing:inherit;}/*!sc*/
code{font-family:'Fira Mono',source-code-pro,Menlo,Monaco,Consolas,'Courier New', monospace;}/*!sc*/
input,button,textarea{font-family:inherit;}/*!sc*/
html,body,#root{height:100%;}/*!sc*/
body{--bg-page1:#F8F9FA;--bg-page2:#FFFFFF;--bg-element1:#FFFFFF;--bg-element2:#F8F9FA;--bg-element3:#E9ECEF;--bg-element4:#DEE2E6;--bg-element5:#212529;--bg-element6:#343A40;--bg-element7:#FFFFFF;--bg-element8:#FBFDFC;--bg-invert:#1E1E1E;--bg-inline-code:#E9ECEF;--bg-tag:#F8F9FA;--text1:#212529;--text2:#495057;--text3:#868E96;--text4:#CED4DA;--border1:#343A40;--border2:#ADB5BD;--border3:#DEE2E6;--border4:#F1F3F5;--primary1:#12B886;--primary2:#20C997;--destructive1:#FF6B6B;--destructive2:#FF8787;--button-text:#FFFFFF;--slight-layer:rgba(0,0,0,0.05);--opaque-layer:rgba(249,249,249,0.85);--editor-footer:#FFFFFF;--prism-bg:#fbfcfd;--prism-default-text:#24292e;--prism-selection-bg:rgba(0,0,0,0.15);--prism-code-block-bg:#fbfcfd;--prism-code-1:#969896;--prism-code-2:#24292e;--prism-code-3:#a626a4;--prism-code-4:#63a35c;--prism-code-5:#0184bc;--prism-code-6:#50a14f;--prism-code-7:#a626a4;--prism-code-8:#005cc5;--prism-code-9:#a626a4;--prism-line-number:#585c63;}/*!sc*/
@media (prefers-color-scheme:dark){body{--bg-page1:#121212;--bg-page2:#121212;--bg-element1:#1E1E1E;--bg-element2:#1E1E1E;--bg-element3:#252525;--bg-element4:#2E2E2E;--bg-element5:#F1F3F5;--bg-element6:#F8F9FA;--bg-element7:#252525;--bg-element8:#0c0c0c;--bg-invert:#FFFFFF;--bg-inline-code:#363636;--bg-tag:#252525;--text1:#ECECEC;--text2:#D9D9D9;--text3:#ACACAC;--text4:#595959;--border1:#E0E0E0;--border2:#A0A0A0;--border3:#4D4D4D;--border4:#2A2A2A;--primary1:#96F2D7;--primary2:#63E6BE;--destructive1:#FFC9C9;--destructive2:#FFA8A8;--button-text:#121212;--slight-layer:rgba(255,255,255,0.1);--opaque-layer:rgba(0,0,0,0.85);--editor-footer:#2E2E2E;--prism-bg:#1E1E1E;--prism-default-text:#e0e6f1;--prism-selection-bg:#383e49;--prism-code-block-bg:#1e1e1e;--prism-code-1:#7c858d;--prism-code-2:#abb2bf;--prism-code-3:#e06c75;--prism-code-4:#d19a66;--prism-code-5:#98c379;--prism-code-6:#56b6c2;--prism-code-7:#c678dd;--prism-code-8:#61afef;--prism-code-9:#c678dd;--prism-line-number:#5c6370;}}/*!sc*/
body[data-theme='light']{--bg-page1:#F8F9FA;--bg-page2:#FFFFFF;--bg-element1:#FFFFFF;--bg-element2:#F8F9FA;--bg-element3:#E9ECEF;--bg-element4:#DEE2E6;--bg-element5:#212529;--bg-element6:#343A40;--bg-element7:#FFFFFF;--bg-element8:#FBFDFC;--bg-invert:#1E1E1E;--bg-inline-code:#E9ECEF;--bg-tag:#F8F9FA;--text1:#212529;--text2:#495057;--text3:#868E96;--text4:#CED4DA;--border1:#343A40;--border2:#ADB5BD;--border3:#DEE2E6;--border4:#F1F3F5;--primary1:#12B886;--primary2:#20C997;--destructive1:#FF6B6B;--destructive2:#FF8787;--button-text:#FFFFFF;--slight-layer:rgba(0,0,0,0.05);--opaque-layer:rgba(249,249,249,0.85);--editor-footer:#FFFFFF;--prism-bg:#fbfcfd;--prism-default-text:#24292e;--prism-selection-bg:rgba(0,0,0,0.15);--prism-code-block-bg:#fbfcfd;--prism-code-1:#969896;--prism-code-2:#24292e;--prism-code-3:#a626a4;--prism-code-4:#63a35c;--prism-code-5:#0184bc;--prism-code-6:#50a14f;--prism-code-7:#a626a4;--prism-code-8:#005cc5;--prism-code-9:#a626a4;--prism-line-number:#585c63;}/*!sc*/
body[data-theme='dark']{--bg-page1:#121212;--bg-page2:#121212;--bg-element1:#1E1E1E;--bg-element2:#1E1E1E;--bg-element3:#252525;--bg-element4:#2E2E2E;--bg-element5:#F1F3F5;--bg-element6:#F8F9FA;--bg-element7:#252525;--bg-element8:#0c0c0c;--bg-invert:#FFFFFF;--bg-inline-code:#363636;--bg-tag:#252525;--text1:#ECECEC;--text2:#D9D9D9;--text3:#ACACAC;--text4:#595959;--border1:#E0E0E0;--border2:#A0A0A0;--border3:#4D4D4D;--border4:#2A2A2A;--primary1:#96F2D7;--primary2:#63E6BE;--destructive1:#FFC9C9;--destructive2:#FFA8A8;--button-text:#121212;--slight-layer:rgba(255,255,255,0.1);--opaque-layer:rgba(0,0,0,0.85);--editor-footer:#2E2E2E;--prism-bg:#1E1E1E;--prism-default-text:#e0e6f1;--prism-selection-bg:#383e49;--prism-code-block-bg:#1e1e1e;--prism-code-1:#7c858d;--prism-code-2:#abb2bf;--prism-code-3:#e06c75;--prism-code-4:#d19a66;--prism-code-5:#98c379;--prism-code-6:#56b6c2;--prism-code-7:#c678dd;--prism-code-8:#61afef;--prism-code-9:#c678dd;--prism-line-number:#5c6370;}/*!sc*/
data-styled.g13[id="sc-global-gYCCRU1"]{content:"sc-global-gYCCRU1,"}/*!sc*/
.cyyZlI{color:inherit;-webkit-text-decoration:none;text-decoration:none;}/*!sc*/
data-styled.g17[id="sc-egiyK"]{content:"cyyZlI,"}/*!sc*/
.fldlST{height:2rem;padding-left:1rem;padding-right:1rem;font-size:1rem;border-radius:1rem;background:none;border:none;outline:none;font-weight:bold;word-break:keep-all;background:var(--bg-element5);color:var(--button-text);-webkit-transition:0.125s all ease-in;transition:0.125s all ease-in;cursor:pointer;}/*!sc*/
.fldlST:hover{background:var(--bg-element6);}/*!sc*/
.fldlST:focus{box-shadow:0px 2px 12px #00000030;}/*!sc*/
.fldlST:disabled{background:var(--bg-element2);}/*!sc*/
data-styled.g18[id="sc-bqiRlB"]{content:"fldlST,"}/*!sc*/
.cQvXTx{width:1728px;margin-left:auto;margin-right:auto;}/*!sc*/
@media (max-width:1919px){.cQvXTx{width:1376px;}}/*!sc*/
@media (max-width:1440px){.cQvXTx{width:1024px;}}/*!sc*/
@media (max-width:1056px){.cQvXTx{width:calc(100% - 2rem);}}/*!sc*/
data-styled.g22[id="sc-fFeiMQ"]{content:"cQvXTx,"}/*!sc*/
.ddFdew{display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;-webkit-align-items:center;-webkit-box-align:center;-ms-flex-align:center;align-items:center;-webkit-box-pack:center;-webkit-justify-content:center;-ms-flex-pack:center;justify-content:center;font-weight:bold;color:var(--text1);font-size:1.3125rem;-webkit-text-decoration:none;text-decoration:none;font-family:Fira Mono,monospace;}/*!sc*/
@media (max-width:1024px){.ddFdew{font-size:1.125rem;}.ddFdew .velog-logo{height:1.25rem;}}/*!sc*/
.ddFdew a{display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;-webkit-align-items:center;-webkit-box-align:center;-ms-flex-align:center;align-items:center;color:inherit;-webkit-text-decoration:none;text-decoration:none;}/*!sc*/
.ddFdew .user-logo{display:block;max-width:calc(100vw - 250px);text-overflow:ellipsis;white-space:nowrap;overflow-x:hidden;overflow-y:hidden;}/*!sc*/
data-styled.g28[id="sc-kfPuZi"]{content:"ddFdew,"}/*!sc*/
.kdLiUF{color:inherit;}/*!sc*/
.kdLiUF svg{color:inherit;margin-right:1rem;width:1.75rem;height:1.75rem;display:block;}/*!sc*/
@media (max-width:1024px){.kdLiUF svg{width:1.5rem;height:1.5rem;margin-right:0.75rem;}}/*!sc*/
data-styled.g29[id="sc-fKVqWL"]{content:"kdLiUF,"}/*!sc*/
.jEdNvQ{height:4rem;}/*!sc*/
data-styled.g30[id="sc-bBHxTw"]{content:"jEdNvQ,"}/*!sc*/
.glTvbH{display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;-webkit-align-items:center;-webkit-box-align:center;-ms-flex-align:center;align-items:center;-webkit-box-pack:center;-webkit-justify-content:center;-ms-flex-pack:center;justify-content:center;background:transparent;border:none;width:2.5rem;height:2.5rem;outline:none;border-radius:50%;color:var(--text1);cursor:pointer;margin-right:0.5rem;}/*!sc*/
.glTvbH:hover{background:var(--slight-layer);}/*!sc*/
.glTvbH svg{width:24px;height:24px;}/*!sc*/
data-styled.g31[id="sc-iwjdpV"]{content:"glTvbH,"}/*!sc*/
.pAGEY{position:relative;display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;-webkit-align-items:center;-webkit-box-align:center;-ms-flex-align:center;align-items:center;-webkit-box-pack:center;-webkit-justify-content:center;-ms-flex-pack:center;justify-content:center;background:transparent;border:none;width:2.5rem;height:2.5rem;outline:none;border-radius:50%;color:var(--text1);cursor:pointer;margin-right:4px;}/*!sc*/
.pAGEY:hover{background:var(--slight-layer);}/*!sc*/
.pAGEY svg{width:24px;height:24px;}/*!sc*/
data-styled.g32[id="sc-cxpSdN"]{content:"pAGEY,"}/*!sc*/
.hrgwyc{height:100%;display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;-webkit-align-items:center;-webkit-box-align:center;-ms-flex-align:center;align-items:center;-webkit-box-pack:justify;-webkit-justify-content:space-between;-ms-flex-pack:justify;justify-content:space-between;}/*!sc*/
data-styled.g34[id="sc-iJKOTD"]{content:"hrgwyc,"}/*!sc*/
.gHrJRn{display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;-webkit-align-items:center;-webkit-box-align:center;-ms-flex-align:center;align-items:center;position:relative;}/*!sc*/
@media (max-width:1024px){.gHrJRn .write-button{display:none;}}/*!sc*/
data-styled.g35[id="sc-giYglK"]{content:"gHrJRn,"}/*!sc*/
.bxsBRa{position:fixed;top:0;background:var(--bg-element1);width:100%;z-index:10;box-shadow:0px 0 8px rgba(0,0,0,0.08);}/*!sc*/
.bxsBRa .tab-wrapper{margin-top:-2rem;}/*!sc*/
data-styled.g50[id="sc-cTAqQK"]{content:"bxsBRa,"}/*!sc*/
.kTIDXm{padding-bottom:4rem;}/*!sc*/
data-styled.g53[id="sc-bBHHxi"]{content:"kTIDXm,"}/*!sc*/
.iLfnNd{background:var(--bg-element4);-webkit-animation:gsdBxV 1s ease-in-out infinite;animation:gsdBxV 1s ease-in-out infinite;display:inline-block;border-radius:4px;height:1em;}/*!sc*/
.sc-lbhJGD + .sc-lbhJGD{margin-left:0.5rem;}/*!sc*/
.jsEdRE{background:var(--bg-element4);-webkit-animation:gsdBxV 1s ease-in-out infinite;animation:gsdBxV 1s ease-in-out infinite;display:inline-block;border-radius:4px;height:1em;}/*!sc*/
data-styled.g60[id="sc-lbhJGD"]{content:"iLfnNd,jsEdRE,"}/*!sc*/
body{background:var(--bg-page2);}/*!sc*/
data-styled.g69[id="sc-global-iqNrnJ1"]{content:"sc-global-iqNrnJ1,"}/*!sc*/
.dXONqK{width:768px;margin-left:auto;margin-right:auto;}/*!sc*/
@media (max-width:768px){.dXONqK{width:100%;}}/*!sc*/
data-styled.g76[id="sc-TBWPX"]{content:"dXONqK,"}/*!sc*/
.gISUXI{margin-bottom:0.875rem;background:var(--bg-tag);padding-left:1rem;padding-right:1rem;height:2rem;border-radius:1rem;display:-webkit-inline-box;display:-webkit-inline-flex;display:-ms-inline-flexbox;display:inline-flex;-webkit-align-items:center;-webkit-box-align:center;-ms-flex-align:center;align-items:center;margin-right:0.875rem;color:var(--primary1);-webkit-text-decoration:none;text-decoration:none;font-weight:500;font-size:1rem;}/*!sc*/
@media (max-width:768px){.gISUXI{height:1.5rem;font-size:0.75rem;border-radius:0.75rem;padding-left:0.75rem;padding-right:0.75rem;margin-right:0.5rem;margin-bottom:0.5rem;}}/*!sc*/
.gISUXI:hover{opacity:0.75;}/*!sc*/
data-styled.g85[id="sc-dtMgUX"]{content:"gISUXI,"}/*!sc*/
.bpMcZw{margin-top:0.875rem;margin-bottom:-0.875rem;min-height:0.875rem;}/*!sc*/
@media (max-width:768px){.bpMcZw{margin-top:0.5rem;margin-bottom:-0.5rem;min-height:0.5rem;}}/*!sc*/
data-styled.g86[id="sc-cZMNgc"]{content:"bpMcZw,"}/*!sc*/
.fiOuRZ{margin-top:5.5rem;}/*!sc*/
@media (max-width:1024px){.fiOuRZ .head-wrapper{padding-left:1rem;padding-right:1rem;}}/*!sc*/
.fiOuRZ h1{font-size:3rem;line-height:1.5;-webkit-letter-spacing:-0.004em;-moz-letter-spacing:-0.004em;-ms-letter-spacing:-0.004em;letter-spacing:-0.004em;margin-top:0;font-weight:800;color:var(--text1);margin-bottom:2rem;word-break:keep-all;overflow-wrap:break-word;-webkit-transition:color 0.125s ease-in;transition:color 0.125s ease-in;}/*!sc*/
@media (max-width:1024px){.fiOuRZ{margin-top:2rem;}.fiOuRZ h1{font-size:2.25rem;}}/*!sc*/
data-styled.g88[id="sc-jQrDum"]{content:"fiOuRZ,"}/*!sc*/
.jGdQwA{font-size:1rem;color:var(--text2);display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;-webkit-box-pack:justify;-webkit-justify-content:space-between;-ms-flex-pack:justify;justify-content:space-between;-webkit-align-items:center;-webkit-box-align:center;-ms-flex-align:center;align-items:center;}/*!sc*/
.jGdQwA .information .username{color:var(--text1);font-weight:bold;}/*!sc*/
.jGdQwA .information .username a{color:inherit;-webkit-text-decoration:none;text-decoration:none;}/*!sc*/
.jGdQwA .information .username a:hover{color:var(--text2);-webkit-text-decoration:underline;text-decoration:underline;}/*!sc*/
.jGdQwA .information .separator{margin-left:0.5rem;margin-right:0.5rem;}/*!sc*/
@media (max-width:768px){.jGdQwA .information{font-size:0.875rem;}}/*!sc*/
@media (max-width:768px){.jGdQwA{margin-bottom:0.75rem;}}/*!sc*/
data-styled.g89[id="sc-fvxzrP"]{content:"jGdQwA,"}/*!sc*/
.eYeYLy{display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;}/*!sc*/
data-styled.g90[id="sc-fbyfCU"]{content:"eYeYLy,"}/*!sc*/
.FTZwa{font-size:1.125rem;color:var(--text1);-webkit-transition:color 0.125s ease-in;transition:color 0.125s ease-in;line-height:1.7;-webkit-letter-spacing:-0.004em;-moz-letter-spacing:-0.004em;-ms-letter-spacing:-0.004em;letter-spacing:-0.004em;word-break:keep-all;word-wrap:break-word;}/*!sc*/
.FTZwa ul b,.FTZwa ol b,.FTZwa p b{font-weight:400;}/*!sc*/
.FTZwa ul code,.FTZwa ol code,.FTZwa p code{background:var(--bg-inline-code);padding:0.2em 0.4em;font-size:85%;border-radius:3px;}/*!sc*/
.FTZwa ul a code,.FTZwa ol a code,.FTZwa p a code{color:var(--primary1);}/*!sc*/
.FTZwa a{color:var(--primary1);-webkit-text-decoration:none;text-decoration:none;}/*!sc*/
.FTZwa a:hover{color:var(--primary1);-webkit-text-decoration:underline;text-decoration:underline;}/*!sc*/
.FTZwa code{font-family:'Fira Mono',source-code-pro,Menlo,Monaco,Consolas, 'Courier New',monospace;}/*!sc*/
.FTZwa hr{border:none;height:1px;width:100%;background:var(--border3);margin-top:2rem;margin-bottom:2rem;}/*!sc*/
.FTZwa p img{display:block;margin:0 auto;max-width:100%;margin-top:3rem;margin-bottom:3rem;}/*!sc*/
.FTZwa h1{font-size:2.5rem;}/*!sc*/
.FTZwa h2{font-size:2rem;}/*!sc*/
.FTZwa h3{font-size:1.5rem;}/*!sc*/
.FTZwa h4{font-size:1.125rem;}/*!sc*/
.FTZwa h1,.FTZwa h2,.FTZwa h3,.FTZwa h4{line-height:1.5;margin-bottom:1rem;}/*!sc*/
.FTZwa p + h1,.FTZwa p + h2,.FTZwa p + h3,.FTZwa p + h4{margin-top:2.5rem;}/*!sc*/
@media (max-width:768px){.FTZwa{font-size:1rem;}.FTZwa h1{font-size:2.25rem;}.FTZwa h2{font-size:1.75rem;}.FTZwa h3{font-size:1.25rem;}.FTZwa h4{font-size:1rem;}.FTZwa h1,.FTZwa h2,.FTZwa h3,.FTZwa h4{margin-bottom:0.75rem;}.FTZwa p + h1,.FTZwa p + h2,.FTZwa p + h3,.FTZwa p + h4{margin-top:2rem;}}/*!sc*/
.FTZwa blockquote{margin-top:2rem;margin-bottom:2rem;border-left:4px solid var(--primary2);border-top-right-radius:4px;border-bottom-right-radius:4px;background:var(--bg-element2);margin-left:0;margin-right:0;padding:1rem;padding-left:2rem;color:var(--text1);}/*!sc*/
.FTZwa blockquote ul,.FTZwa blockquote ol{padding-left:1rem;}/*!sc*/
.FTZwa blockquote *:first-child{margin-top:0;}/*!sc*/
.FTZwa blockquote *:last-child{margin-bottom:0;}/*!sc*/
data-styled.g93[id="sc-bXTejn"]{content:"FTZwa,"}/*!sc*/
.gdnhbG.atom-one pre{background:var(--prism-bg);}/*!sc*/
.gdnhbG.atom-one code[class*='language-'],.gdnhbG.atom-one pre[class*='language-']{color:var(--prism-default-text);background:none;text-align:left;white-space:pre;word-spacing:normal;word-break:normal;word-wrap:normal;-moz-tab-size:4;-o-tab-size:4;tab-size:4;-webkit-hyphens:none;-moz-hyphens:none;-ms-hyphens:none;-webkit-hyphens:none;-moz-hyphens:none;-ms-hyphens:none;hyphens:none;}/*!sc*/
.gdnhbG.atom-one pre[class*='language-']::-moz-selection,.gdnhbG.atom-one pre[class*='language-'] ::-moz-selection,.gdnhbG.atom-one code[class*='language-']::-moz-selection,.gdnhbG.atom-one code[class*='language-'] ::-moz-selection{text-shadow:none;background:var(--prism-selection-bg);}/*!sc*/
.gdnhbG.atom-one pre[class*='language-']::selection,.gdnhbG.atom-one pre[class*='language-'] ::selection,.gdnhbG.atom-one code[class*='language-']::selection,.gdnhbG.atom-one code[class*='language-'] ::selection{text-shadow:none;background:var(--prism-selection-bg);}/*!sc*/
@media print{.gdnhbG.atom-one code[class*='language-'],.gdnhbG.atom-one pre[class*='language-']{text-shadow:none;}}/*!sc*/
.gdnhbG.atom-one pre[class*='language-']{padding:1em;margin:0.5em 0;overflow:auto;}/*!sc*/
.gdnhbG.atom-one:not(pre) > code[class*='language-'],.gdnhbG.atom-one pre[class*='language-']{background:var(--prism-code-block-bg);}/*!sc*/
.gdnhbG.atom-one:not(pre) > code[class*='language-']{padding:0.1em;border-radius:0.3em;white-space:normal;}/*!sc*/
.gdnhbG.atom-one .token.comment,.gdnhbG.atom-one .token.prolog,.gdnhbG.atom-one .token.doctype,.gdnhbG.atom-one .token.cdata{color:var(--prism-code-1);}/*!sc*/
.gdnhbG.atom-one .token.punctuation{color:var(--prism-code-2);}/*!sc*/
.gdnhbG.atom-one .token.selector,.gdnhbG.atom-one .token.tag{color:var(--prism-code-3);}/*!sc*/
.gdnhbG.atom-one .token.property,.gdnhbG.atom-one .token.boolean,.gdnhbG.atom-one .token.number,.gdnhbG.atom-one .token.constant,.gdnhbG.atom-one .token.symbol,.gdnhbG.atom-one .token.attr-name,.gdnhbG.atom-one .token.deleted{color:var(--prism-code-4);}/*!sc*/
.gdnhbG.atom-one .token.string,.gdnhbG.atom-one .token.char,.gdnhbG.atom-one .token.attr-value,.gdnhbG.atom-one .token.builtin,.gdnhbG.atom-one .token.inserted{color:var(--prism-code-6);}/*!sc*/
.gdnhbG.atom-one .token.operator,.gdnhbG.atom-one .token.entity,.gdnhbG.atom-one .token.url,.gdnhbG.atom-one .language-css .token.string,.gdnhbG.atom-one .style .token.string{color:var(--prism-code-5);}/*!sc*/
.gdnhbG.atom-one .token.atrule,.gdnhbG.atom-one .token.keyword{color:var(--prism-code-7);}/*!sc*/
.gdnhbG.atom-one .token.function{color:var(--prism-code-8);}/*!sc*/
.gdnhbG.atom-one .token.regex,.gdnhbG.atom-one .token.important,.gdnhbG.atom-one .token.variable{color:var(--prism-code-9);}/*!sc*/
.gdnhbG.atom-one .token.important,.gdnhbG.atom-one .token.bold{font-weight:bold;}/*!sc*/
.gdnhbG.atom-one .token.italic{font-style:italic;}/*!sc*/
.gdnhbG.atom-one .token.entity{cursor:help;}/*!sc*/
.gdnhbG.atom-one pre.line-numbers{position:relative;padding-left:3.8em;counter-reset:linenumber;}/*!sc*/
.gdnhbG.atom-one pre.line-numbers > code{position:relative;}/*!sc*/
.gdnhbG.atom-one .line-numbers .line-numbers-rows{position:absolute;pointer-events:none;top:0;font-size:100%;left:-3.8em;width:3em;-webkit-letter-spacing:-1px;-moz-letter-spacing:-1px;-ms-letter-spacing:-1px;letter-spacing:-1px;border-right:0;-webkit-user-select:none;-moz-user-select:none;-ms-user-select:none;-webkit-user-select:none;-moz-user-select:none;-ms-user-select:none;user-select:none;}/*!sc*/
.gdnhbG.atom-one .line-numbers-rows > span{pointer-events:none;display:block;counter-increment:linenumber;}/*!sc*/
.gdnhbG.atom-one .line-numbers-rows > span:before{content:counter(linenumber);color:var(--prism-line-number);display:block;padding-right:0.8em;text-align:right;}/*!sc*/
.gdnhbG.github code,.gdnhbG.github code[class*='language-'],.gdnhbG.github pre[class*='language-']{color:#24292e;}/*!sc*/
.gdnhbG.github pre{color:#24292e;background:#f6f8fa;}/*!sc*/
.gdnhbG.github .token.function{color:#005cc5;}/*!sc*/
.gdnhbG.github .token.comment,.gdnhbG.github .token.prolog,.gdnhbG.github .token.doctype,.gdnhbG.github .token.cdata{color:#969896;}/*!sc*/
.gdnhbG.github .token.punctuation{color:#24292e;}/*!sc*/
.gdnhbG.github .token.string{color:#032f62;}/*!sc*/
.gdnhbG.github .token.atrule,.gdnhbG.github .token.attr-value{color:#183691;}/*!sc*/
.gdnhbG.github .token.property,.gdnhbG.github .token.tag{color:#63a35c;}/*!sc*/
.gdnhbG.github .token.boolean,.gdnhbG.github .token.number{color:#0086b3;}/*!sc*/
.gdnhbG.github .token.selector,.gdnhbG.github .token.attr-name,.gdnhbG.github .token.attr-value .punctuation:first-child,.gdnhbG.github .token.keyword,.gdnhbG.github .token.regex,.gdnhbG.github .token.important{color:#d73a49;}/*!sc*/
.gdnhbG.github .token.operator,.gdnhbG.github .token.entity,.gdnhbG.github .token.url,.gdnhbG.github .language-css{color:#d73a49;}/*!sc*/
.gdnhbG.github .token.entity{cursor:help;}/*!sc*/
.gdnhbG.github .namespace{opacity:0.7;}/*!sc*/
.gdnhbG.monokai code[class*='language-'],.gdnhbG.monokai pre[class*='language-']{color:#f8f8f2;text-shadow:0 1px rgba(0,0,0,0.3);}/*!sc*/
.gdnhbG.monokai:not(pre) > code[class*='language-'],.gdnhbG.monokai pre[class*='language-']{background:#272822;}/*!sc*/
.gdnhbG.monokai pre{color:#f8f8f2;text-shadow:0 1px rgba(0,0,0,0.3);background:#272822;}/*!sc*/
.gdnhbG.monokai .token.comment,.gdnhbG.monokai .token.prolog,.gdnhbG.monokai .token.doctype,.gdnhbG.monokai .token.cdata{color:#778090;}/*!sc*/
.gdnhbG.monokai .token.punctuation{color:#f8f8f2;}/*!sc*/
.gdnhbG.monokai .namespace{opacity:0.7;}/*!sc*/
.gdnhbG.monokai .token.property,.gdnhbG.monokai .token.tag,.gdnhbG.monokai .token.constant,.gdnhbG.monokai .token.symbol,.gdnhbG.monokai .token.deleted{color:#f92672;}/*!sc*/
.gdnhbG.monokai .token.boolean,.gdnhbG.monokai .token.number{color:#ae81ff;}/*!sc*/
.gdnhbG.monokai .token.selector,.gdnhbG.monokai .token.attr-name,.gdnhbG.monokai .token.string,.gdnhbG.monokai .token.char,.gdnhbG.monokai .token.builtin,.gdnhbG.monokai .token.inserted{color:#a6e22e;}/*!sc*/
.gdnhbG.monokai .token.operator,.gdnhbG.monokai .token.entity,.gdnhbG.monokai .token.url,.gdnhbG.monokai .language-css .token.string,.gdnhbG.monokai .style .token.string,.gdnhbG.monokai .token.variable{color:#f8f8f2;}/*!sc*/
.gdnhbG.monokai .token.atrule,.gdnhbG.monokai .token.attr-value,.gdnhbG.monokai .token.function{color:#e6db74;}/*!sc*/
.gdnhbG.monokai .token.keyword{color:#f92672;}/*!sc*/
.gdnhbG.monokai .token.regex,.gdnhbG.monokai .token.important{color:#fd971f;}/*!sc*/
.gdnhbG.monokai .token.important,.gdnhbG.monokai .token.bold{font-weight:bold;}/*!sc*/
.gdnhbG.monokai .token.italic{font-style:italic;}/*!sc*/
.gdnhbG.monokai .token.entity{cursor:help;}/*!sc*/
.gdnhbG.dracula code[class*='language-'],.gdnhbG.dracula pre[class*='language-']{color:#ccc;background:rgb(40,41,54);}/*!sc*/
.gdnhbG.dracula pre[class*='language-']::-moz-selection,.gdnhbG.dracula pre[class*='language-'] ::-moz-selection,.gdnhbG.dracula code[class*='language-']::-moz-selection,.gdnhbG.dracula code[class*='language-'] ::-moz-selection{text-shadow:none;background-color:#5a5f80;}/*!sc*/
.gdnhbG.dracula pre[class*='language-']::selection,.gdnhbG.dracula pre[class*='language-'] ::selection,.gdnhbG.dracula code[class*='language-']::selection,.gdnhbG.dracula code[class*='language-'] ::selection{text-shadow:none;background-color:#5a5f80;}/*!sc*/
.gdnhbG.dracula:not(pre) > code[class*='language-']{border-radius:0.3em;white-space:normal;}/*!sc*/
.gdnhbG.dracula pre{color:#ccc;background:rgb(40,41,54);}/*!sc*/
.gdnhbG.dracula .limit-300{height:300px !important;}/*!sc*/
.gdnhbG.dracula .limit-400{height:400px !important;}/*!sc*/
.gdnhbG.dracula .limit-500{height:500px !important;}/*!sc*/
.gdnhbG.dracula .limit-600{height:600px !important;}/*!sc*/
.gdnhbG.dracula .limit-700{height:700px !important;}/*!sc*/
.gdnhbG.dracula .limit-800{height:800px !important;}/*!sc*/
.gdnhbG.dracula .token.comment{color:rgba(98,114,164,1);}/*!sc*/
.gdnhbG.dracula .token.prolog{color:rgba(207,207,194,1);}/*!sc*/
.gdnhbG.dracula .token.tag{color:rgba(220,104,170,1);}/*!sc*/
.gdnhbG.dracula .token.entity{color:rgba(139,233,253,1);}/*!sc*/
.gdnhbG.dracula .token.atrule{color:rgba(98,239,117,1);}/*!sc*/
.gdnhbG.dracula .token.url{color:rgba(102,217,239,1);}/*!sc*/
.gdnhbG.dracula .token.selector{color:rgba(207,207,194,1);}/*!sc*/
.gdnhbG.dracula .token.string{color:rgba(241,250,140,1);}/*!sc*/
.gdnhbG.dracula .token.property{color:rgba(255,184,108,1);}/*!sc*/
.gdnhbG.dracula .token.important{color:rgba(255,121,198,1);font-weight:bold;}/*!sc*/
.gdnhbG.dracula .token.punctuation{color:rgba(230,219,116,1);}/*!sc*/
.gdnhbG.dracula .token.number{color:rgba(189,147,249,1);}/*!sc*/
.gdnhbG.dracula .token.function{color:rgba(80,250,123,1);}/*!sc*/
.gdnhbG.dracula .token.class-name{color:rgba(255,184,108,1);}/*!sc*/
.gdnhbG.dracula .token.keyword{color:rgba(255,121,198,1);}/*!sc*/
.gdnhbG.dracula .token.boolean{color:rgba(255,184,108,1);}/*!sc*/
.gdnhbG.dracula .token.operator{color:rgba(139,233,253,1);}/*!sc*/
.gdnhbG.dracula .token.char{color:rgba(255,135,157,1);}/*!sc*/
.gdnhbG.dracula .token.regex{color:rgba(80,250,123,1);}/*!sc*/
.gdnhbG.dracula .token.variable{color:rgba(80,250,123,1);}/*!sc*/
.gdnhbG.dracula .token.constant{color:rgba(255,184,108,1);}/*!sc*/
.gdnhbG.dracula .token.symbol{color:rgba(255,184,108,1);}/*!sc*/
.gdnhbG.dracula .token.builtin{color:rgba(255,121,198,1);}/*!sc*/
.gdnhbG.dracula .token.attr-value{color:#7ec699;}/*!sc*/
.gdnhbG.dracula .token.deleted{color:#e2777a;}/*!sc*/
.gdnhbG.dracula .token.namespace{color:#e2777a;}/*!sc*/
.gdnhbG.dracula .token.bold{font-weight:bold;}/*!sc*/
.gdnhbG.dracula .token.italic{font-style:italic;}/*!sc*/
.gdnhbG.dracula .token{color:#ff79c6;}/*!sc*/
.gdnhbG.dracula .langague-cpp .token.string{color:#8be9fd;}/*!sc*/
.gdnhbG.dracula .langague-c .token.string{color:#8be9fd;}/*!sc*/
.gdnhbG.dracula .language-css .token.selector{color:rgba(80,250,123,1);}/*!sc*/
.gdnhbG.dracula .language-css .token.property{color:rgba(255,184,108,1);}/*!sc*/
.gdnhbG.dracula .language-java span.token.class-name{color:#8be9fd;}/*!sc*/
.gdnhbG.dracula .language-java .token.class-name{color:#8be9fd;}/*!sc*/
.gdnhbG.dracula .language-markup .token.attr-value{color:rgba(102,217,239,1);}/*!sc*/
.gdnhbG.dracula .language-markup .token.tag{color:rgba(80,250,123,1);}/*!sc*/
.gdnhbG.dracula .language-objectivec .token.property{color:#66d9ef;}/*!sc*/
.gdnhbG.dracula .language-objectivec .token.string{color:#50fa7b;}/*!sc*/
.gdnhbG.dracula .language-php .token.boolean{color:#8be9fd;}/*!sc*/
.gdnhbG.dracula .language-php .token.function{color:#ff79c6;}/*!sc*/
.gdnhbG.dracula .language-php .token.keyword{color:#66d9ef;}/*!sc*/
.gdnhbG.dracula .language-ruby .token.symbol{color:#8be9fd;}/*!sc*/
.gdnhbG.dracula .language-ruby .token.class-name{color:#cfcfc2;}/*!sc*/
.gdnhbG.dracula pre.line-numbers{position:relative;padding-left:3.8em;counter-reset:linenumber;}/*!sc*/
.gdnhbG.dracula pre.line-numbers > code{position:relative;white-space:inherit;}/*!sc*/
.gdnhbG.dracula .line-numbers .line-numbers-rows{position:absolute;pointer-events:none;top:0;font-size:100%;left:-3.8em;width:3em;-webkit-letter-spacing:-1px;-moz-letter-spacing:-1px;-ms-letter-spacing:-1px;letter-spacing:-1px;border-right:1px solid #999;-webkit-user-select:none;-moz-user-select:none;-ms-user-select:none;-webkit-user-select:none;-moz-user-select:none;-ms-user-select:none;user-select:none;}/*!sc*/
.gdnhbG.dracula .line-numbers-rows > span{pointer-events:none;display:block;counter-increment:linenumber;}/*!sc*/
.gdnhbG.dracula .line-numbers-rows > span:before{content:counter(linenumber);color:#999;display:block;padding-right:0.8em;text-align:right;}/*!sc*/
.gdnhbG.dracula div.code-toolbar{position:relative;}/*!sc*/
.gdnhbG.dracula div.code-toolbar > .toolbar{position:absolute;top:0.3em;right:0.2em;-webkit-transition:opacity 0.3s ease-in-out;transition:opacity 0.3s ease-in-out;opacity:0;}/*!sc*/
.gdnhbG.dracula div.code-toolbar:hover > .toolbar{opacity:1;}/*!sc*/
.gdnhbG.dracula div.code-toolbar > .toolbar .toolbar-item{display:inline-block;padding-right:20px;}/*!sc*/
.gdnhbG.dracula div.code-toolbar > .toolbar a{cursor:pointer;}/*!sc*/
.gdnhbG.dracula div.code-toolbar > .toolbar button{background:none;border:0;color:inherit;font:inherit;line-height:normal;overflow:visible;padding:0;-webkit-user-select:none;-moz-user-select:none;-ms-user-select:none;}/*!sc*/
.gdnhbG.dracula div.code-toolbar > .toolbar a,.gdnhbG.dracula div.code-toolbar > .toolbar button,.gdnhbG.dracula div.code-toolbar > .toolbar span{color:#ccc;font-size:0.8em;padding:0.5em;background:rgba(98,114,164,1);border-radius:0.5em;}/*!sc*/
.gdnhbG.dracula div.code-toolbar > .toolbar a:hover,.gdnhbG.dracula div.code-toolbar > .toolbar a:focus,.gdnhbG.dracula div.code-toolbar > .toolbar button:hover,.gdnhbG.dracula div.code-toolbar > .toolbar button:focus,.gdnhbG.dracula div.code-toolbar > .toolbar span:hover,.gdnhbG.dracula div.code-toolbar > .toolbar span:focus{color:inherit;-webkit-text-decoration:none;text-decoration:none;background-color:var(--verde);}/*!sc*/
.gdnhbG pre{font-family:'Fira Mono',source-code-pro,Menlo,Monaco,Consolas, 'Courier New',monospace;font-size:0.875rem;padding:1rem;border-radius:4px;line-height:1.5;overflow-x:auto;-webkit-letter-spacing:0px;-moz-letter-spacing:0px;-ms-letter-spacing:0px;letter-spacing:0px;}/*!sc*/
@media (max-width:768px){.gdnhbG pre{font-size:0.75rem;padding:0.75rem;}}/*!sc*/
.gdnhbG img{max-width:100%;height:auto;display:block;margin-top:1.5rem;margin-bottom:1.5rem;}/*!sc*/
.gdnhbG iframe{width:768px;height:430px;max-width:100%;background:black;display:block;margin:auto;border:none;border-radius:4px;overflow:hidden;}/*!sc*/
.gdnhbG .twitter-wrapper{display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;-webkit-box-pack:center;-webkit-justify-content:center;-ms-flex-pack:center;justify-content:center;-webkit-align-items:center;-webkit-box-align:center;-ms-flex-align:center;align-items:center;border-left:none;background:none;padding:none;}/*!sc*/
.gdnhbG table{min-width:40%;max-width:100%;border:1px solid var(--border2);border-collapse:collapse;font-size:0.875rem;}/*!sc*/
.gdnhbG table thead > tr > th{border-bottom:4px solid var(--border2);}/*!sc*/
.gdnhbG table th,.gdnhbG table td{word-break:break-word;padding:0.5rem;}/*!sc*/
.gdnhbG table td + td,.gdnhbG table th + th{border-left:1px solid var(--border2);}/*!sc*/
.gdnhbG table tr:nth-child(even){background:var(--bg-element2);}/*!sc*/
.gdnhbG table tr:nth-child(odd){background:var(--bg-page1);}/*!sc*/
.gdnhbG .katex-mathml{display:none;}/*!sc*/
data-styled.g94[id="sc-eGRUor"]{content:"gdnhbG,"}/*!sc*/
.bfzjcP{width:768px;margin:0 auto;margin-top:5rem;}/*!sc*/
@media (max-width:1024px){.bfzjcP{padding-left:1rem;padding-right:1rem;}}/*!sc*/
@media (max-width:768px){.bfzjcP{width:100%;}}/*!sc*/
data-styled.g96[id="sc-dFtzxp"]{content:"bfzjcP,"}/*!sc*/
.cgYvDI{margin-top:3rem;color:var(--text1);}/*!sc*/
.cgYvDI h4{font-size:1.125rem;line-height:1.5;font-weight:600;margin-bottom:1rem;}/*!sc*/
@media (max-width:768px){.cgYvDI{padding-left:1rem;padding-right:1rem;}}/*!sc*/
data-styled.g97[id="sc-brSvTw"]{content:"cgYvDI,"}/*!sc*/
.BdYrx > .buttons-wrapper{display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;-webkit-box-pack:end;-webkit-justify-content:flex-end;-ms-flex-pack:end;justify-content:flex-end;}/*!sc*/
data-styled.g99[id="sc-evcjhq"]{content:"BdYrx,"}/*!sc*/
.fQjmlN{resize:none;padding:1rem;padding-bottom:1.5rem;outline:none;border:1px solid var(--border4);margin-bottom:1.5rem;width:100%;border-radius:4px;min-height:6.125rem;font-size:1rem;color:var(--text1);line-height:1.75;background:var(--bg-element1);}/*!sc*/
.fQjmlN::-webkit-input-placeholder{color:var(--text3);}/*!sc*/
.fQjmlN::-moz-placeholder{color:var(--text3);}/*!sc*/
.fQjmlN:-ms-input-placeholder{color:var(--text3);}/*!sc*/
.fQjmlN::placeholder{color:var(--text3);}/*!sc*/
@media (max-width:768px){.fQjmlN{margin-bottom:1rem;}}/*!sc*/
data-styled.g100[id="sc-fHeRUh"]{content:"fQjmlN,"}/*!sc*/
.dDifDS{margin-top:2.5rem;}/*!sc*/
data-styled.g111[id="sc-dVNjXY"]{content:"dDifDS,"}/*!sc*/
.kzTxBt{position:relative;margin-top:2rem;}/*!sc*/
@media (max-width:1024px){.kzTxBt{display:none;}}/*!sc*/
data-styled.g113[id="sc-bQtKYq"]{content:"kzTxBt,"}/*!sc*/
.brUzDR{position:absolute;left:-7rem;}/*!sc*/
data-styled.g114[id="sc-fXEqDS"]{content:"brUzDR,"}/*!sc*/
.knjEeh{width:4rem;background:var(--bg-element2);border:1px solid var(--border4);border-radius:2rem;padding:0.5rem;display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;-webkit-flex-direction:column;-ms-flex-direction:column;flex-direction:column;-webkit-align-items:center;-webkit-box-align:center;-ms-flex-align:center;align-items:center;}/*!sc*/
data-styled.g115[id="sc-FNXRL"]{content:"knjEeh,"}/*!sc*/
.gCPYbd{height:3rem;width:3rem;display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;-webkit-align-items:center;-webkit-box-align:center;-ms-flex-align:center;align-items:center;-webkit-box-pack:center;-webkit-justify-content:center;-ms-flex-pack:center;justify-content:center;background:var(--bg-element1);border:1px solid var(--border3);border-radius:1.5rem;color:var(--text3);cursor:pointer;z-index:5;}/*!sc*/
.gCPYbd svg{width:24px;height:24px;}/*!sc*/
.gCPYbd svg.share{width:20px;height:20px;}/*!sc*/
.gCPYbd:hover{color:var(--text1);border-color:var(--text1);}/*!sc*/
data-styled.g116[id="sc-jWUzzU"]{content:"gCPYbd,"}/*!sc*/
.djwcYU{margin-top:0.5rem;color:var(--text2);line-height:1;font-size:0.75rem;margin-bottom:1rem;font-weight:bold;}/*!sc*/
data-styled.g117[id="sc-eFegNN"]{content:"djwcYU,"}/*!sc*/
.dZrsFD{position:relative;width:100%;z-index:5;}/*!sc*/
.dZrsFD .positioner{position:absolute;}/*!sc*/
data-styled.g118[id="sc-fmBCVi"]{content:"dZrsFD,"}/*!sc*/
.bxhFtZ{top:0;left:0;position:absolute;width:48px;height:48px;}/*!sc*/
data-styled.g119[id="sc-lkgTHX"]{content:"bxhFtZ,"}/*!sc*/
.fibSC{width:32px;height:32px;border-radius:16px;display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;-webkit-align-items:center;-webkit-box-align:center;-ms-flex-align:center;align-items:center;-webkit-box-pack:center;-webkit-justify-content:center;-ms-flex-pack:center;justify-content:center;border:1px solid var(--primary2);font-size:1.5rem;color:var(--primary2);margin-right:1rem;}/*!sc*/
.cMDwOh{width:32px;height:32px;border-radius:16px;display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;-webkit-align-items:center;-webkit-box-align:center;-ms-flex-align:center;align-items:center;-webkit-box-pack:center;-webkit-justify-content:center;-ms-flex-pack:center;justify-content:center;border:1px solid var(--primary2);font-size:1.5rem;color:var(--primary2);margin-left:1rem;}/*!sc*/
data-styled.g124[id="sc-hjGZqJ"]{content:"fibSC,cMDwOh,"}/*!sc*/
.hlGICj{cursor:pointer;background:var(--bg-element2);box-shadow:0 0 4px 0 rgba(0,0,0,0.06);width:100%;padding-left:1rem;padding-right:1rem;height:4rem;display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;-webkit-align-items:center;-webkit-box-align:center;-ms-flex-align:center;align-items:center;-webkit-text-decoration:none;text-decoration:none;}/*!sc*/
.hlGICj:hover .sc-hjGZqJ{-webkit-animation-duration:0.35s;animation-duration:0.35s;-webkit-animation-name:dRQjsE;animation-name:dRQjsE;-webkit-animation-fill-mode:forwards;animation-fill-mode:forwards;-webkit-animation-timing-function:ease-out;animation-timing-function:ease-out;}/*!sc*/
.jSBDGM{cursor:pointer;background:var(--bg-element2);box-shadow:0 0 4px 0 rgba(0,0,0,0.06);width:100%;padding-left:1rem;padding-right:1rem;height:4rem;display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;-webkit-align-items:center;-webkit-box-align:center;-ms-flex-align:center;align-items:center;-webkit-text-decoration:none;text-decoration:none;-webkit-flex-direction:row-reverse;-ms-flex-direction:row-reverse;flex-direction:row-reverse;}/*!sc*/
.jSBDGM:hover .sc-hjGZqJ{-webkit-animation-duration:0.35s;animation-duration:0.35s;-webkit-animation-name:iyGUEJ;animation-name:iyGUEJ;-webkit-animation-fill-mode:forwards;animation-fill-mode:forwards;-webkit-animation-timing-function:ease-out;animation-timing-function:ease-out;}/*!sc*/
data-styled.g125[id="sc-gUQvok"]{content:"hlGICj,jSBDGM,"}/*!sc*/
.fKjWde{-webkit-flex:1;-ms-flex:1;flex:1;display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;-webkit-flex-direction:column;-ms-flex-direction:column;flex-direction:column;-webkit-align-items:flex-start;-webkit-box-align:flex-start;-ms-flex-align:flex-start;align-items:flex-start;line-height:1;min-width:0;}/*!sc*/
.fKjWde .description{font-size:0.75rem;font-weight:bold;color:var(--text2);}/*!sc*/
.fKjWde h3{width:100%;font-size:1.125rem;color:var(--text2);line-height:1.15;margin:0;margin-top:0.5rem;text-overflow:ellipsis;white-space:nowrap;overflow-x:hidden;overflow-y:hidden;}/*!sc*/
@media (max-width:768px){.fKjWde h3{font-size:1rem;}}/*!sc*/
.cQpWGt{-webkit-flex:1;-ms-flex:1;flex:1;display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;-webkit-flex-direction:column;-ms-flex-direction:column;flex-direction:column;-webkit-align-items:flex-end;-webkit-box-align:flex-end;-ms-flex-align:flex-end;align-items:flex-end;line-height:1;min-width:0;}/*!sc*/
.cQpWGt .description{font-size:0.75rem;font-weight:bold;color:var(--text2);}/*!sc*/
.cQpWGt h3{text-align:right;width:100%;font-size:1.125rem;color:var(--text2);line-height:1.15;margin:0;margin-top:0.5rem;text-overflow:ellipsis;white-space:nowrap;overflow-x:hidden;overflow-y:hidden;}/*!sc*/
@media (max-width:768px){.cQpWGt h3{font-size:1rem;}}/*!sc*/
data-styled.g126[id="sc-fXeWAj"]{content:"fKjWde,cQpWGt,"}/*!sc*/
.dpmQGl{margin-top:3rem;display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;}/*!sc*/
@media (max-width:768px){.dpmQGl{-webkit-flex-direction:column-reverse;-ms-flex-direction:column-reverse;flex-direction:column-reverse;padding-left:1rem;padding-right:1rem;}}/*!sc*/
data-styled.g127[id="sc-fIosxK"]{content:"dpmQGl,"}/*!sc*/
.bVYpNI{min-width:0;-webkit-flex:1;-ms-flex:1;flex:1;}/*!sc*/
.sc-gyElHZ + .sc-gyElHZ{margin-left:3rem;}/*!sc*/
@media (max-width:768px){.bVYpNI{-webkit-flex:initial;-ms-flex:initial;flex:initial;width:100%;}.sc-gyElHZ + .sc-gyElHZ{margin-left:0;margin-bottom:1.5rem;}}/*!sc*/
data-styled.g128[id="sc-gyElHZ"]{content:"bVYpNI,"}/*!sc*/
@media (max-width:1024px){.kTQxVU{padding-left:1rem;padding-right:1rem;}}/*!sc*/
data-styled.g129[id="sc-gjNHFA"]{content:"kTQxVU,"}/*!sc*/
.gPzODR{display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;-webkit-box-pack:justify;-webkit-justify-content:space-between;-ms-flex-pack:justify;justify-content:space-between;-webkit-align-items:center;-webkit-box-align:center;-ms-flex-align:center;align-items:center;}/*!sc*/
.gPzODR .left{display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;}/*!sc*/
@media (max-width:768px){.gPzODR .left{-webkit-flex-direction:column;-ms-flex-direction:column;flex-direction:column;}}/*!sc*/
.gPzODR img{display:block;width:8rem;height:8rem;border-radius:50%;object-fit:cover;box-shadow:0 0 4px 0 rgba(0,0,0,0.06);}/*!sc*/
@media (max-width:768px){.gPzODR img{width:5rem;height:5rem;}}/*!sc*/
data-styled.g130[id="sc-fmciRz"]{content:"gPzODR,"}/*!sc*/
.yXXbT{display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;-webkit-flex-direction:column;-ms-flex-direction:column;flex-direction:column;-webkit-box-pack:center;-webkit-justify-content:center;-ms-flex-pack:center;justify-content:center;margin-left:1rem;margin-right:1rem;}/*!sc*/
.yXXbT .name{font-size:1.5rem;line-height:1.5;font-weight:bold;color:var(--text1);}/*!sc*/
.yXXbT .name a{color:inherit;-webkit-text-decoration:none;text-decoration:none;}/*!sc*/
.yXXbT .name a:hover{color:var(--text1);-webkit-text-decoration:underline;text-decoration:underline;}/*!sc*/
.yXXbT .description{white-space:pre-wrap;font-size:1.125rem;line-height:1.5;margin-top:0.25rem;color:var(--text2);-webkit-letter-spacing:-0.004em;-moz-letter-spacing:-0.004em;-ms-letter-spacing:-0.004em;letter-spacing:-0.004em;}/*!sc*/
@media (max-width:768px){.yXXbT{margin-left:0;margin-top:1rem;}.yXXbT .name{font-size:1.125rem;}.yXXbT .description{margin-top:0.5rem;font-size:0.875rem;-webkit-letter-spacing:-0.004em;-moz-letter-spacing:-0.004em;-ms-letter-spacing:-0.004em;letter-spacing:-0.004em;}}/*!sc*/
data-styled.g131[id="sc-eXlEPa"]{content:"yXXbT,"}/*!sc*/
.hbZRXU{background:var(--bg-element3);width:100%;height:1px;margin-top:2rem;margin-bottom:1.5rem;}/*!sc*/
@media (max-width:768px){.hbZRXU{margin-top:1rem;margin-bottom:1rem;}}/*!sc*/
data-styled.g132[id="sc-iFMAIt"]{content:"hbZRXU,"}/*!sc*/
.koQQwu{color:var(--text3);display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;}/*!sc*/
.koQQwu svg{cursor:pointer;width:2rem;height:2rem;}/*!sc*/
.koQQwu svg:hover{color:var(--text1);}/*!sc*/
@media (max-width:768px){.koQQwu svg{width:1.5rem;height:1.5rem;}}/*!sc*/
.koQQwu a{color:inherit;display:block;}/*!sc*/
.koQQwu a + a,.koQQwu a + svg{margin-left:1rem;}/*!sc*/
data-styled.g133[id="sc-iqVWFU"]{content:"koQQwu,"}/*!sc*/
.efeYel{margin-top:5.5rem;}/*!sc*/
.efeYel h1{padding-right:2rem;font-size:3.75rem;margin-top:0;margin-bottom:2rem;display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;}/*!sc*/
.efeYel .subinfo{font-size:1rem;}/*!sc*/
.efeYel .tags{font-size:2rem;margin-top:0.875rem;}/*!sc*/
.efeYel .tags .tag-skeleton + .tag-skeleton{margin-left:0.5rem;}/*!sc*/
.efeYel .series{margin-top:2rem;}/*!sc*/
.efeYel .thumbnail{margin-top:2rem;padding-top:52.35%;position:relative;}/*!sc*/
.efeYel .thumbnail .thumbnail-skeleton{position:absolute;top:0;left:0;width:100%;height:100%;}/*!sc*/
.efeYel .contents{margin-top:5rem;}/*!sc*/
.efeYel .contents .line{margin-bottom:0.75rem;display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;font-size:1.125rem;}/*!sc*/
.efeYel .contents .lines + .lines{margin-top:3rem;}/*!sc*/
@media (max-width:1024px){.efeYel{margin-top:2rem;}.efeYel h1{font-size:2.25rem;}.efeYel .subinfo{font-size:0.875rem;}.efeYel .tags{font-size:1.5rem;}}/*!sc*/
data-styled.g136[id="sc-dwsnSq"]{content:"efeYel,"}/*!sc*/
@media (max-width:768px){.kaTEDx{padding-left:1rem;padding-right:1rem;}}/*!sc*/
data-styled.g137[id="sc-jtXEFf"]{content:"kaTEDx,"}/*!sc*/
.gyXrCE{display:none;-webkit-align-items:center;-webkit-box-align:center;-ms-flex-align:center;align-items:center;background:var(--bg-element1);border:1px solid var(--border2);padding-left:0.75rem;padding-right:0.75rem;-webkit-align-items:center;-webkit-box-align:center;-ms-flex-align:center;align-items:center;height:1.5rem;border-radius:0.75rem;outline:none;}/*!sc*/
.gyXrCE svg{width:0.75rem;height:0.75rem;margin-right:0.75rem;color:var(--text3);}/*!sc*/
.gyXrCE span{font-size:0.75rem;font-weight:bold;color:var(--text3);}/*!sc*/
@media (max-width:1024px){.gyXrCE{display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;margin-left:0.5rem;}}/*!sc*/
data-styled.g138[id="sc-eldieg"]{content:"gyXrCE,"}/*!sc*/
.iIZjji{width:96px;height:32px;font-size:16px;}/*!sc*/
@media (max-width:1024px){.iIZjji{width:80px;height:24px;font-size:14px;}}/*!sc*/
@media (max-width:425px){.iIZjji{width:72px;font-size:12px;}}/*!sc*/
.iIZjji .button{display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;box-shadow:none;-webkit-align-items:center;-webkit-box-align:center;-ms-flex-align:center;align-items:center;-webkit-box-pack:center;-webkit-justify-content:center;-ms-flex-pack:center;justify-content:center;background-color:var(--bg-element1);cursor:pointer;border-radius:16px;font-weight:700;width:100%;height:100%;white-space:nowrap;outline:none;font-size:16px;}/*!sc*/
@media (max-width:768px){.iIZjji .button{font-size:14px;}}/*!sc*/
@media (max-width:425px){.iIZjji .button{font-size:12px;}}/*!sc*/
.iIZjji .follow-button{color:var(--primary1);border:1px solid var(--primary1);}/*!sc*/
.iIZjji .unfollow-button{color:var(--bg-element6);border:1px solid var(--bg-element6);}/*!sc*/
data-styled.g143[id="sc-avest"]{content:"iIZjji,"}/*!sc*/
.cALPIq{margin-top:1rem;margin-bottom:1rem;}/*!sc*/
data-styled.g144[id="sc-kmQMED"]{content:"cALPIq,"}/*!sc*/
.bksdVp{margin-top:16rem;margin-bottom:6rem;}/*!sc*/
@media (max-width:1024px){.bksdVp{margin-top:8rem;margin-bottom:3rem;}}/*!sc*/
@media (max-width:768px){.bksdVp{margin-top:2rem;}}/*!sc*/
data-styled.g146[id="sc-djWRfJ"]{content:"bksdVp,"}/*!sc*/
@-webkit-keyframes gsdBxV{0%{opacity:0.5;}50%{opacity:1;}100%{opacity:0.5;}}/*!sc*/
@keyframes gsdBxV{0%{opacity:0.5;}50%{opacity:1;}100%{opacity:0.5;}}/*!sc*/
data-styled.g147[id="sc-keyframes-gsdBxV"]{content:"gsdBxV,"}/*!sc*/
body{background:var(--bg-page2);}/*!sc*/
data-styled.g148[id="sc-global-iqNrnJ2"]{content:"sc-global-iqNrnJ2,"}/*!sc*/
body{margin:0;padding:0;font-family:-apple-system,BlinkMacSystemFont,"Helvetica Neue","Apple SD Gothic Neo","Malgun Gothic","맑은 고딕",나눔고딕,"Nanum Gothic","Noto Sans KR","Noto Sans CJK KR",arial,돋움,Dotum,Tahoma,Geneva,sans-serif;-webkit-font-smoothing:antialiased;-moz-osx-font-smoothing:grayscale;color:var(--text1);box-sizing:border-box;}/*!sc*/
*{box-sizing:inherit;}/*!sc*/
code{font-family:'Fira Mono',source-code-pro,Menlo,Monaco,Consolas,'Courier New', monospace;}/*!sc*/
input,button,textarea{font-family:inherit;}/*!sc*/
html,body,#root{height:100%;}/*!sc*/
body{--bg-page1:#F8F9FA;--bg-page2:#FFFFFF;--bg-element1:#FFFFFF;--bg-element2:#F8F9FA;--bg-element3:#E9ECEF;--bg-element4:#DEE2E6;--bg-element5:#212529;--bg-element6:#343A40;--bg-element7:#FFFFFF;--bg-element8:#FBFDFC;--bg-invert:#1E1E1E;--bg-inline-code:#E9ECEF;--bg-tag:#F8F9FA;--text1:#212529;--text2:#495057;--text3:#868E96;--text4:#CED4DA;--border1:#343A40;--border2:#ADB5BD;--border3:#DEE2E6;--border4:#F1F3F5;--primary1:#12B886;--primary2:#20C997;--destructive1:#FF6B6B;--destructive2:#FF8787;--button-text:#FFFFFF;--slight-layer:rgba(0,0,0,0.05);--opaque-layer:rgba(249,249,249,0.85);--editor-footer:#FFFFFF;--prism-bg:#fbfcfd;--prism-default-text:#24292e;--prism-selection-bg:rgba(0,0,0,0.15);--prism-code-block-bg:#fbfcfd;--prism-code-1:#969896;--prism-code-2:#24292e;--prism-code-3:#a626a4;--prism-code-4:#63a35c;--prism-code-5:#0184bc;--prism-code-6:#50a14f;--prism-code-7:#a626a4;--prism-code-8:#005cc5;--prism-code-9:#a626a4;--prism-line-number:#585c63;}/*!sc*/
@media (prefers-color-scheme:dark){body{--bg-page1:#121212;--bg-page2:#121212;--bg-element1:#1E1E1E;--bg-element2:#1E1E1E;--bg-element3:#252525;--bg-element4:#2E2E2E;--bg-element5:#F1F3F5;--bg-element6:#F8F9FA;--bg-element7:#252525;--bg-element8:#0c0c0c;--bg-invert:#FFFFFF;--bg-inline-code:#363636;--bg-tag:#252525;--text1:#ECECEC;--text2:#D9D9D9;--text3:#ACACAC;--text4:#595959;--border1:#E0E0E0;--border2:#A0A0A0;--border3:#4D4D4D;--border4:#2A2A2A;--primary1:#96F2D7;--primary2:#63E6BE;--destructive1:#FFC9C9;--destructive2:#FFA8A8;--button-text:#121212;--slight-layer:rgba(255,255,255,0.1);--opaque-layer:rgba(0,0,0,0.85);--editor-footer:#2E2E2E;--prism-bg:#1E1E1E;--prism-default-text:#e0e6f1;--prism-selection-bg:#383e49;--prism-code-block-bg:#1e1e1e;--prism-code-1:#7c858d;--prism-code-2:#abb2bf;--prism-code-3:#e06c75;--prism-code-4:#d19a66;--prism-code-5:#98c379;--prism-code-6:#56b6c2;--prism-code-7:#c678dd;--prism-code-8:#61afef;--prism-code-9:#c678dd;--prism-line-number:#5c6370;}}/*!sc*/
body[data-theme='light']{--bg-page1:#F8F9FA;--bg-page2:#FFFFFF;--bg-element1:#FFFFFF;--bg-element2:#F8F9FA;--bg-element3:#E9ECEF;--bg-element4:#DEE2E6;--bg-element5:#212529;--bg-element6:#343A40;--bg-element7:#FFFFFF;--bg-element8:#FBFDFC;--bg-invert:#1E1E1E;--bg-inline-code:#E9ECEF;--bg-tag:#F8F9FA;--text1:#212529;--text2:#495057;--text3:#868E96;--text4:#CED4DA;--border1:#343A40;--border2:#ADB5BD;--border3:#DEE2E6;--border4:#F1F3F5;--primary1:#12B886;--primary2:#20C997;--destructive1:#FF6B6B;--destructive2:#FF8787;--button-text:#FFFFFF;--slight-layer:rgba(0,0,0,0.05);--opaque-layer:rgba(249,249,249,0.85);--editor-footer:#FFFFFF;--prism-bg:#fbfcfd;--prism-default-text:#24292e;--prism-selection-bg:rgba(0,0,0,0.15);--prism-code-block-bg:#fbfcfd;--prism-code-1:#969896;--prism-code-2:#24292e;--prism-code-3:#a626a4;--prism-code-4:#63a35c;--prism-code-5:#0184bc;--prism-code-6:#50a14f;--prism-code-7:#a626a4;--prism-code-8:#005cc5;--prism-code-9:#a626a4;--prism-line-number:#585c63;}/*!sc*/
body[data-theme='dark']{--bg-page1:#121212;--bg-page2:#121212;--bg-element1:#1E1E1E;--bg-element2:#1E1E1E;--bg-element3:#252525;--bg-element4:#2E2E2E;--bg-element5:#F1F3F5;--bg-element6:#F8F9FA;--bg-element7:#252525;--bg-element8:#0c0c0c;--bg-invert:#FFFFFF;--bg-inline-code:#363636;--bg-tag:#252525;--text1:#ECECEC;--text2:#D9D9D9;--text3:#ACACAC;--text4:#595959;--border1:#E0E0E0;--border2:#A0A0A0;--border3:#4D4D4D;--border4:#2A2A2A;--primary1:#96F2D7;--primary2:#63E6BE;--destructive1:#FFC9C9;--destructive2:#FFA8A8;--button-text:#121212;--slight-layer:rgba(255,255,255,0.1);--opaque-layer:rgba(0,0,0,0.85);--editor-footer:#2E2E2E;--prism-bg:#1E1E1E;--prism-default-text:#e0e6f1;--prism-selection-bg:#383e49;--prism-code-block-bg:#1e1e1e;--prism-code-1:#7c858d;--prism-code-2:#abb2bf;--prism-code-3:#e06c75;--prism-code-4:#d19a66;--prism-code-5:#98c379;--prism-code-6:#56b6c2;--prism-code-7:#c678dd;--prism-code-8:#61afef;--prism-code-9:#c678dd;--prism-line-number:#5c6370;}/*!sc*/
data-styled.g149[id="sc-global-gYCCRU2"]{content:"sc-global-gYCCRU2,"}/*!sc*/
body{background:var(--bg-page2);}/*!sc*/
data-styled.g150[id="sc-global-iqNrnJ3"]{content:"sc-global-iqNrnJ3,"}/*!sc*/
body{margin:0;padding:0;font-family:-apple-system,BlinkMacSystemFont,"Helvetica Neue","Apple SD Gothic Neo","Malgun Gothic","맑은 고딕",나눔고딕,"Nanum Gothic","Noto Sans KR","Noto Sans CJK KR",arial,돋움,Dotum,Tahoma,Geneva,sans-serif;-webkit-font-smoothing:antialiased;-moz-osx-font-smoothing:grayscale;color:var(--text1);box-sizing:border-box;}/*!sc*/
*{box-sizing:inherit;}/*!sc*/
code{font-family:'Fira Mono',source-code-pro,Menlo,Monaco,Consolas,'Courier New', monospace;}/*!sc*/
input,button,textarea{font-family:inherit;}/*!sc*/
html,body,#root{height:100%;}/*!sc*/
body{--bg-page1:#F8F9FA;--bg-page2:#FFFFFF;--bg-element1:#FFFFFF;--bg-element2:#F8F9FA;--bg-element3:#E9ECEF;--bg-element4:#DEE2E6;--bg-element5:#212529;--bg-element6:#343A40;--bg-element7:#FFFFFF;--bg-element8:#FBFDFC;--bg-invert:#1E1E1E;--bg-inline-code:#E9ECEF;--bg-tag:#F8F9FA;--text1:#212529;--text2:#495057;--text3:#868E96;--text4:#CED4DA;--border1:#343A40;--border2:#ADB5BD;--border3:#DEE2E6;--border4:#F1F3F5;--primary1:#12B886;--primary2:#20C997;--destructive1:#FF6B6B;--destructive2:#FF8787;--button-text:#FFFFFF;--slight-layer:rgba(0,0,0,0.05);--opaque-layer:rgba(249,249,249,0.85);--editor-footer:#FFFFFF;--prism-bg:#fbfcfd;--prism-default-text:#24292e;--prism-selection-bg:rgba(0,0,0,0.15);--prism-code-block-bg:#fbfcfd;--prism-code-1:#969896;--prism-code-2:#24292e;--prism-code-3:#a626a4;--prism-code-4:#63a35c;--prism-code-5:#0184bc;--prism-code-6:#50a14f;--prism-code-7:#a626a4;--prism-code-8:#005cc5;--prism-code-9:#a626a4;--prism-line-number:#585c63;}/*!sc*/
@media (prefers-color-scheme:dark){body{--bg-page1:#121212;--bg-page2:#121212;--bg-element1:#1E1E1E;--bg-element2:#1E1E1E;--bg-element3:#252525;--bg-element4:#2E2E2E;--bg-element5:#F1F3F5;--bg-element6:#F8F9FA;--bg-element7:#252525;--bg-element8:#0c0c0c;--bg-invert:#FFFFFF;--bg-inline-code:#363636;--bg-tag:#252525;--text1:#ECECEC;--text2:#D9D9D9;--text3:#ACACAC;--text4:#595959;--border1:#E0E0E0;--border2:#A0A0A0;--border3:#4D4D4D;--border4:#2A2A2A;--primary1:#96F2D7;--primary2:#63E6BE;--destructive1:#FFC9C9;--destructive2:#FFA8A8;--button-text:#121212;--slight-layer:rgba(255,255,255,0.1);--opaque-layer:rgba(0,0,0,0.85);--editor-footer:#2E2E2E;--prism-bg:#1E1E1E;--prism-default-text:#e0e6f1;--prism-selection-bg:#383e49;--prism-code-block-bg:#1e1e1e;--prism-code-1:#7c858d;--prism-code-2:#abb2bf;--prism-code-3:#e06c75;--prism-code-4:#d19a66;--prism-code-5:#98c379;--prism-code-6:#56b6c2;--prism-code-7:#c678dd;--prism-code-8:#61afef;--prism-code-9:#c678dd;--prism-line-number:#5c6370;}}/*!sc*/
body[data-theme='light']{--bg-page1:#F8F9FA;--bg-page2:#FFFFFF;--bg-element1:#FFFFFF;--bg-element2:#F8F9FA;--bg-element3:#E9ECEF;--bg-element4:#DEE2E6;--bg-element5:#212529;--bg-element6:#343A40;--bg-element7:#FFFFFF;--bg-element8:#FBFDFC;--bg-invert:#1E1E1E;--bg-inline-code:#E9ECEF;--bg-tag:#F8F9FA;--text1:#212529;--text2:#495057;--text3:#868E96;--text4:#CED4DA;--border1:#343A40;--border2:#ADB5BD;--border3:#DEE2E6;--border4:#F1F3F5;--primary1:#12B886;--primary2:#20C997;--destructive1:#FF6B6B;--destructive2:#FF8787;--button-text:#FFFFFF;--slight-layer:rgba(0,0,0,0.05);--opaque-layer:rgba(249,249,249,0.85);--editor-footer:#FFFFFF;--prism-bg:#fbfcfd;--prism-default-text:#24292e;--prism-selection-bg:rgba(0,0,0,0.15);--prism-code-block-bg:#fbfcfd;--prism-code-1:#969896;--prism-code-2:#24292e;--prism-code-3:#a626a4;--prism-code-4:#63a35c;--prism-code-5:#0184bc;--prism-code-6:#50a14f;--prism-code-7:#a626a4;--prism-code-8:#005cc5;--prism-code-9:#a626a4;--prism-line-number:#585c63;}/*!sc*/
body[data-theme='dark']{--bg-page1:#121212;--bg-page2:#121212;--bg-element1:#1E1E1E;--bg-element2:#1E1E1E;--bg-element3:#252525;--bg-element4:#2E2E2E;--bg-element5:#F1F3F5;--bg-element6:#F8F9FA;--bg-element7:#252525;--bg-element8:#0c0c0c;--bg-invert:#FFFFFF;--bg-inline-code:#363636;--bg-tag:#252525;--text1:#ECECEC;--text2:#D9D9D9;--text3:#ACACAC;--text4:#595959;--border1:#E0E0E0;--border2:#A0A0A0;--border3:#4D4D4D;--border4:#2A2A2A;--primary1:#96F2D7;--primary2:#63E6BE;--destructive1:#FFC9C9;--destructive2:#FFA8A8;--button-text:#121212;--slight-layer:rgba(255,255,255,0.1);--opaque-layer:rgba(0,0,0,0.85);--editor-footer:#2E2E2E;--prism-bg:#1E1E1E;--prism-default-text:#e0e6f1;--prism-selection-bg:#383e49;--prism-code-block-bg:#1e1e1e;--prism-code-1:#7c858d;--prism-code-2:#abb2bf;--prism-code-3:#e06c75;--prism-code-4:#d19a66;--prism-code-5:#98c379;--prism-code-6:#56b6c2;--prism-code-7:#c678dd;--prism-code-8:#61afef;--prism-code-9:#c678dd;--prism-line-number:#5c6370;}/*!sc*/
data-styled.g151[id="sc-global-gYCCRU3"]{content:"sc-global-gYCCRU3,"}/*!sc*/
body{background:var(--bg-page2);}/*!sc*/
data-styled.g152[id="sc-global-iqNrnJ4"]{content:"sc-global-iqNrnJ4,"}/*!sc*/
body{margin:0;padding:0;font-family:-apple-system,BlinkMacSystemFont,"Helvetica Neue","Apple SD Gothic Neo","Malgun Gothic","맑은 고딕",나눔고딕,"Nanum Gothic","Noto Sans KR","Noto Sans CJK KR",arial,돋움,Dotum,Tahoma,Geneva,sans-serif;-webkit-font-smoothing:antialiased;-moz-osx-font-smoothing:grayscale;color:var(--text1);box-sizing:border-box;}/*!sc*/
*{box-sizing:inherit;}/*!sc*/
code{font-family:'Fira Mono',source-code-pro,Menlo,Monaco,Consolas,'Courier New', monospace;}/*!sc*/
input,button,textarea{font-family:inherit;}/*!sc*/
html,body,#root{height:100%;}/*!sc*/
body{--bg-page1:#F8F9FA;--bg-page2:#FFFFFF;--bg-element1:#FFFFFF;--bg-element2:#F8F9FA;--bg-element3:#E9ECEF;--bg-element4:#DEE2E6;--bg-element5:#212529;--bg-element6:#343A40;--bg-element7:#FFFFFF;--bg-element8:#FBFDFC;--bg-invert:#1E1E1E;--bg-inline-code:#E9ECEF;--bg-tag:#F8F9FA;--text1:#212529;--text2:#495057;--text3:#868E96;--text4:#CED4DA;--border1:#343A40;--border2:#ADB5BD;--border3:#DEE2E6;--border4:#F1F3F5;--primary1:#12B886;--primary2:#20C997;--destructive1:#FF6B6B;--destructive2:#FF8787;--button-text:#FFFFFF;--slight-layer:rgba(0,0,0,0.05);--opaque-layer:rgba(249,249,249,0.85);--editor-footer:#FFFFFF;--prism-bg:#fbfcfd;--prism-default-text:#24292e;--prism-selection-bg:rgba(0,0,0,0.15);--prism-code-block-bg:#fbfcfd;--prism-code-1:#969896;--prism-code-2:#24292e;--prism-code-3:#a626a4;--prism-code-4:#63a35c;--prism-code-5:#0184bc;--prism-code-6:#50a14f;--prism-code-7:#a626a4;--prism-code-8:#005cc5;--prism-code-9:#a626a4;--prism-line-number:#585c63;}/*!sc*/
@media (prefers-color-scheme:dark){body{--bg-page1:#121212;--bg-page2:#121212;--bg-element1:#1E1E1E;--bg-element2:#1E1E1E;--bg-element3:#252525;--bg-element4:#2E2E2E;--bg-element5:#F1F3F5;--bg-element6:#F8F9FA;--bg-element7:#252525;--bg-element8:#0c0c0c;--bg-invert:#FFFFFF;--bg-inline-code:#363636;--bg-tag:#252525;--text1:#ECECEC;--text2:#D9D9D9;--text3:#ACACAC;--text4:#595959;--border1:#E0E0E0;--border2:#A0A0A0;--border3:#4D4D4D;--border4:#2A2A2A;--primary1:#96F2D7;--primary2:#63E6BE;--destructive1:#FFC9C9;--destructive2:#FFA8A8;--button-text:#121212;--slight-layer:rgba(255,255,255,0.1);--opaque-layer:rgba(0,0,0,0.85);--editor-footer:#2E2E2E;--prism-bg:#1E1E1E;--prism-default-text:#e0e6f1;--prism-selection-bg:#383e49;--prism-code-block-bg:#1e1e1e;--prism-code-1:#7c858d;--prism-code-2:#abb2bf;--prism-code-3:#e06c75;--prism-code-4:#d19a66;--prism-code-5:#98c379;--prism-code-6:#56b6c2;--prism-code-7:#c678dd;--prism-code-8:#61afef;--prism-code-9:#c678dd;--prism-line-number:#5c6370;}}/*!sc*/
body[data-theme='light']{--bg-page1:#F8F9FA;--bg-page2:#FFFFFF;--bg-element1:#FFFFFF;--bg-element2:#F8F9FA;--bg-element3:#E9ECEF;--bg-element4:#DEE2E6;--bg-element5:#212529;--bg-element6:#343A40;--bg-element7:#FFFFFF;--bg-element8:#FBFDFC;--bg-invert:#1E1E1E;--bg-inline-code:#E9ECEF;--bg-tag:#F8F9FA;--text1:#212529;--text2:#495057;--text3:#868E96;--text4:#CED4DA;--border1:#343A40;--border2:#ADB5BD;--border3:#DEE2E6;--border4:#F1F3F5;--primary1:#12B886;--primary2:#20C997;--destructive1:#FF6B6B;--destructive2:#FF8787;--button-text:#FFFFFF;--slight-layer:rgba(0,0,0,0.05);--opaque-layer:rgba(249,249,249,0.85);--editor-footer:#FFFFFF;--prism-bg:#fbfcfd;--prism-default-text:#24292e;--prism-selection-bg:rgba(0,0,0,0.15);--prism-code-block-bg:#fbfcfd;--prism-code-1:#969896;--prism-code-2:#24292e;--prism-code-3:#a626a4;--prism-code-4:#63a35c;--prism-code-5:#0184bc;--prism-code-6:#50a14f;--prism-code-7:#a626a4;--prism-code-8:#005cc5;--prism-code-9:#a626a4;--prism-line-number:#585c63;}/*!sc*/
body[data-theme='dark']{--bg-page1:#121212;--bg-page2:#121212;--bg-element1:#1E1E1E;--bg-element2:#1E1E1E;--bg-element3:#252525;--bg-element4:#2E2E2E;--bg-element5:#F1F3F5;--bg-element6:#F8F9FA;--bg-element7:#252525;--bg-element8:#0c0c0c;--bg-invert:#FFFFFF;--bg-inline-code:#363636;--bg-tag:#252525;--text1:#ECECEC;--text2:#D9D9D9;--text3:#ACACAC;--text4:#595959;--border1:#E0E0E0;--border2:#A0A0A0;--border3:#4D4D4D;--border4:#2A2A2A;--primary1:#96F2D7;--primary2:#63E6BE;--destructive1:#FFC9C9;--destructive2:#FFA8A8;--button-text:#121212;--slight-layer:rgba(255,255,255,0.1);--opaque-layer:rgba(0,0,0,0.85);--editor-footer:#2E2E2E;--prism-bg:#1E1E1E;--prism-default-text:#e0e6f1;--prism-selection-bg:#383e49;--prism-code-block-bg:#1e1e1e;--prism-code-1:#7c858d;--prism-code-2:#abb2bf;--prism-code-3:#e06c75;--prism-code-4:#d19a66;--prism-code-5:#98c379;--prism-code-6:#56b6c2;--prism-code-7:#c678dd;--prism-code-8:#61afef;--prism-code-9:#c678dd;--prism-line-number:#5c6370;}/*!sc*/
data-styled.g153[id="sc-global-gYCCRU4"]{content:"sc-global-gYCCRU4,"}/*!sc*/
@-webkit-keyframes dRQjsE{0%{-webkit-transform:translateX(0px);-ms-transform:translateX(0px);transform:translateX(0px);}50%{-webkit-transform:translateX(-8px);-ms-transform:translateX(-8px);transform:translateX(-8px);}100%{-webkit-transform:translateX(0px);-ms-transform:translateX(0px);transform:translateX(0px);}}/*!sc*/
@keyframes dRQjsE{0%{-webkit-transform:translateX(0px);-ms-transform:translateX(0px);transform:translateX(0px);}50%{-webkit-transform:translateX(-8px);-ms-transform:translateX(-8px);transform:translateX(-8px);}100%{-webkit-transform:translateX(0px);-ms-transform:translateX(0px);transform:translateX(0px);}}/*!sc*/
data-styled.g154[id="sc-keyframes-dRQjsE"]{content:"dRQjsE,"}/*!sc*/
@-webkit-keyframes iyGUEJ{0%{-webkit-transform:translateX(0px);-ms-transform:translateX(0px);transform:translateX(0px);}50%{-webkit-transform:translateX(8px);-ms-transform:translateX(8px);transform:translateX(8px);}100%{-webkit-transform:translateX(0px);-ms-transform:translateX(0px);transform:translateX(0px);}}/*!sc*/
@keyframes iyGUEJ{0%{-webkit-transform:translateX(0px);-ms-transform:translateX(0px);transform:translateX(0px);}50%{-webkit-transform:translateX(8px);-ms-transform:translateX(8px);transform:translateX(8px);}100%{-webkit-transform:translateX(0px);-ms-transform:translateX(0px);transform:translateX(0px);}}/*!sc*/
data-styled.g155[id="sc-keyframes-iyGUEJ"]{content:"iyGUEJ,"}/*!sc*/
</style><link data-chunk="main" rel="preload" as="style" href="https://static.velog.io/static/css/main.e7869632.chunk.css"/><link data-chunk="main" rel="preload" as="style" href="https://static.velog.io/static/css/20.5dbdccff.chunk.css"/><link data-chunk="main" rel="preload" as="script" href="https://static.velog.io/static/js/runtime-main.9e7b02fe.js"/><link data-chunk="main" rel="preload" as="script" href="https://static.velog.io/static/js/20.76da1523.chunk.js"/><link data-chunk="main" rel="preload" as="script" href="https://static.velog.io/static/js/main.630a53bb.chunk.js"/><link data-chunk="pages-velog-VelogPage" rel="preload" as="script" href="https://static.velog.io/static/js/pages-velog-VelogPage.dabf735b.chunk.js"/><link data-chunk="PostPage" rel="preload" as="script" href="https://static.velog.io/static/js/0.79976788.chunk.js"/><link data-chunk="PostPage" rel="preload" as="script" href="https://static.velog.io/static/js/23.2e3f2cf1.chunk.js"/><link data-chunk="PostPage" rel="preload" as="script" href="https://static.velog.io/static/js/1.6ba86eda.chunk.js"/><link data-chunk="PostPage" rel="preload" as="script" href="https://static.velog.io/static/js/PostPage.42edd71f.chunk.js"/><link data-chunk="main" rel="stylesheet" href="https://static.velog.io/static/css/20.5dbdccff.chunk.css"/><link data-chunk="main" rel="stylesheet" href="https://static.velog.io/static/css/main.e7869632.chunk.css"/><link rel="shortcut icon" href="https://static.velog.io/favicon.ico"/><link rel="apple-touch-icon" sizes="152x152" href="https://static.velog.io/favicons/apple-icon-152x152.png"/><link rel="icon" sizes="32x32" href="https://static.velog.io/favicons/favicon-32x32.png"/><link rel="icon" sizes="96x96" href="https://static.velog.io/favicons/favicon-96x96.png"/><link rel="icon" sizes="16x16" href="https://static.velog.io/favicons/favicon-16x16.png"/><meta name="viewport" content="width=device-width, initial-scale=1"/><script async="" src="https://pagead2.googlesyndication.com/pagead/js/adsbygoogle.js?client=ca-pub-9161852896103498" crossorigin="anonymous"></script><script async="" src="https://www.googletagmanager.com/gtag/js?id=G-8D0MD2S4PK"></script><script>window.dataLayer = window.dataLayer || [];
            function gtag(){dataLayer.push(arguments);}
            gtag('js', new Date());
          
            gtag('config', 'G-8D0MD2S4PK');</script><script defer="" src="https://challenges.cloudflare.com/turnstile/v0/api.js?onload=onAppReady"></script></head><body><div id="root"><div class="__jazzbar false false" style="width:0%"></div><div class="sc-dPiLbb sc-bBHHxi kTIDXm"><div class="sc-bBHxTw jEdNvQ"><div class="sc-fFeiMQ cQvXTx sc-iJKOTD hrgwyc"><div class="sc-kfPuZi ddFdew"><a href="https://velog.io/" class="sc-egiyK cyyZlI sc-fKVqWL kdLiUF"><svg width="192" height="192" viewBox="0 0 192 192" fill="currentColor"><path fill-rule="evenodd" clip-rule="evenodd" d="M24 0H168C181.255 0 192 10.7451 192 24V168C192 181.255 181.255 192 168 192H24C10.7451 192 0 181.255 0 168V24C0 10.7451 10.7451 0 24 0ZM49 57.9199V65.48H67L80.6799 142.52L98.5 141.26C116.02 119.06 127.84 102.44 133.96 91.3999C140.2 80.24 143.32 70.9399 143.32 63.5C143.32 59.0601 142 55.7 139.36 53.4199C136.84 51.1399 133.66 50 129.82 50C122.62 50 116.62 53.0601 111.82 59.1799C116.5 62.3 119.68 64.8799 121.36 66.9199C123.16 68.8401 124.06 71.4199 124.06 74.6599C124.06 80.0601 122.44 86.1799 119.2 93.02C116.08 99.8601 112.66 105.92 108.94 111.2C106.54 114.56 103.48 118.7 99.76 123.62L88.0601 57.2C87.1001 52.3999 84.1001 50 79.0601 50C76.78 50 72.3999 50.96 65.9199 52.8799C59.4399 54.6799 53.8 56.3601 49 57.9199Z" fill="currentColor"></path></svg></a><a href="https://velog.io/@eldoradodo/posts" class="sc-egiyK cyyZlI user-logo"><span>eldoradodo.log</span></a></div><div class="sc-giYglK gHrJRn"><a href="https://velog.io/notifications" class="sc-egiyK cyyZlI sc-cxpSdN pAGEY"><svg width="24" height="24" viewBox="0 0 24 24"><g id="Icon_Notification"><path id="notifications" d="M4 19V17H6V10C6 8.61667 6.41667 7.3875 7.25 6.3125C8.08333 5.2375 9.16667 4.53333 10.5 4.2V3.5C10.5 3.08333 10.6458 2.72917 10.9375 2.4375C11.2292 2.14583 11.5833 2 12 2C12.4167 2 12.7708 2.14583 13.0625 2.4375C13.3542 2.72917 13.5 3.08333 13.5 3.5V4.2C14.8333 4.53333 15.9167 5.2375 16.75 6.3125C17.5833 7.3875 18 8.61667 18 10V17H20V19H4ZM12 22C11.45 22 10.9792 21.8042 10.5875 21.4125C10.1958 21.0208 10 20.55 10 20H14C14 20.55 13.8042 21.0208 13.4125 21.4125C13.0208 21.8042 12.55 22 12 22ZM8 17H16V10C16 8.9 15.6083 7.95833 14.825 7.175C14.0417 6.39167 13.1 6 12 6C10.9 6 9.95833 6.39167 9.175 7.175C8.39167 7.95833 8 8.9 8 10V17Z" fill="currentColor"></path></g></svg></a><a class="sc-iwjdpV glTvbH" href="/search?username=eldoradodo"><svg width="24" height="24" viewBox="0 0 24 24"><g id="Icon_Search"><path id="search" d="M19.3256 20.7122L13.5174 14.9041C13.0116 15.3227 12.4231 15.6495 11.752 15.8847C11.0801 16.1205 10.3692 16.2384 9.61919 16.2384C7.77035 16.2384 6.20477 15.5972 4.92244 14.3149C3.64081 13.0333 3 11.468 3 9.61919C3 7.77035 3.63663 6.20477 4.90988 4.92244C6.18314 3.64081 7.74419 3 9.59302 3C11.4593 3 13.0336 3.64081 14.3159 4.92244C15.5976 6.20477 16.2384 7.77035 16.2384 9.61919C16.2384 10.3692 16.1208 11.0798 15.8857 11.7509C15.6499 12.4228 15.3227 13.0203 14.9041 13.5436L20.7384 19.3517C20.9128 19.5262 21 19.7442 21 20.0058C21 20.2674 20.9041 20.5029 20.7122 20.7122C20.5203 20.9041 20.2894 21 20.0194 21C19.7487 21 19.5174 20.9041 19.3256 20.7122ZM9.61919 14.2762C10.9099 14.2762 12.0087 13.8227 12.9157 12.9157C13.8227 12.0087 14.2762 10.9099 14.2762 9.61919C14.2762 8.31105 13.8227 7.20767 12.9157 6.30907C12.0087 5.41116 10.9099 4.96221 9.61919 4.96221C8.31105 4.96221 7.20802 5.41116 6.31012 6.30907C5.41151 7.20767 4.96221 8.31105 4.96221 9.61919C4.96221 10.9099 5.41151 12.0087 6.31012 12.9157C7.20802 13.8227 8.31105 14.2762 9.61919 14.2762Z" fill="currentColor"></path></g></svg></a><button color="darkGray" class="sc-bqiRlB fldlST">로그인</button></div></div></div><div style="margin-top:0;opacity:0" class="sc-cTAqQK bxsBRa"><div class="sc-bBHxTw jEdNvQ"><div class="sc-fFeiMQ cQvXTx sc-iJKOTD hrgwyc"><div class="sc-kfPuZi ddFdew"><a href="https://velog.io/" class="sc-egiyK cyyZlI sc-fKVqWL kdLiUF"><svg width="192" height="192" viewBox="0 0 192 192" fill="currentColor"><path fill-rule="evenodd" clip-rule="evenodd" d="M24 0H168C181.255 0 192 10.7451 192 24V168C192 181.255 181.255 192 168 192H24C10.7451 192 0 181.255 0 168V24C0 10.7451 10.7451 0 24 0ZM49 57.9199V65.48H67L80.6799 142.52L98.5 141.26C116.02 119.06 127.84 102.44 133.96 91.3999C140.2 80.24 143.32 70.9399 143.32 63.5C143.32 59.0601 142 55.7 139.36 53.4199C136.84 51.1399 133.66 50 129.82 50C122.62 50 116.62 53.0601 111.82 59.1799C116.5 62.3 119.68 64.8799 121.36 66.9199C123.16 68.8401 124.06 71.4199 124.06 74.6599C124.06 80.0601 122.44 86.1799 119.2 93.02C116.08 99.8601 112.66 105.92 108.94 111.2C106.54 114.56 103.48 118.7 99.76 123.62L88.0601 57.2C87.1001 52.3999 84.1001 50 79.0601 50C76.78 50 72.3999 50.96 65.9199 52.8799C59.4399 54.6799 53.8 56.3601 49 57.9199Z" fill="currentColor"></path></svg></a><a href="https://velog.io/@eldoradodo/posts" class="sc-egiyK cyyZlI user-logo"><span>eldoradodo.log</span></a></div><div class="sc-giYglK gHrJRn"><a href="https://velog.io/notifications" class="sc-egiyK cyyZlI sc-cxpSdN pAGEY"><svg width="24" height="24" viewBox="0 0 24 24"><g id="Icon_Notification"><path id="notifications" d="M4 19V17H6V10C6 8.61667 6.41667 7.3875 7.25 6.3125C8.08333 5.2375 9.16667 4.53333 10.5 4.2V3.5C10.5 3.08333 10.6458 2.72917 10.9375 2.4375C11.2292 2.14583 11.5833 2 12 2C12.4167 2 12.7708 2.14583 13.0625 2.4375C13.3542 2.72917 13.5 3.08333 13.5 3.5V4.2C14.8333 4.53333 15.9167 5.2375 16.75 6.3125C17.5833 7.3875 18 8.61667 18 10V17H20V19H4ZM12 22C11.45 22 10.9792 21.8042 10.5875 21.4125C10.1958 21.0208 10 20.55 10 20H14C14 20.55 13.8042 21.0208 13.4125 21.4125C13.0208 21.8042 12.55 22 12 22ZM8 17H16V10C16 8.9 15.6083 7.95833 14.825 7.175C14.0417 6.39167 13.1 6 12 6C10.9 6 9.95833 6.39167 9.175 7.175C8.39167 7.95833 8 8.9 8 10V17Z" fill="currentColor"></path></g></svg></a><a class="sc-iwjdpV glTvbH" href="/search?username=eldoradodo"><svg width="24" height="24" viewBox="0 0 24 24"><g id="Icon_Search"><path id="search" d="M19.3256 20.7122L13.5174 14.9041C13.0116 15.3227 12.4231 15.6495 11.752 15.8847C11.0801 16.1205 10.3692 16.2384 9.61919 16.2384C7.77035 16.2384 6.20477 15.5972 4.92244 14.3149C3.64081 13.0333 3 11.468 3 9.61919C3 7.77035 3.63663 6.20477 4.90988 4.92244C6.18314 3.64081 7.74419 3 9.59302 3C11.4593 3 13.0336 3.64081 14.3159 4.92244C15.5976 6.20477 16.2384 7.77035 16.2384 9.61919C16.2384 10.3692 16.1208 11.0798 15.8857 11.7509C15.6499 12.4228 15.3227 13.0203 14.9041 13.5436L20.7384 19.3517C20.9128 19.5262 21 19.7442 21 20.0058C21 20.2674 20.9041 20.5029 20.7122 20.7122C20.5203 20.9041 20.2894 21 20.0194 21C19.7487 21 19.5174 20.9041 19.3256 20.7122ZM9.61919 14.2762C10.9099 14.2762 12.0087 13.8227 12.9157 12.9157C13.8227 12.0087 14.2762 10.9099 14.2762 9.61919C14.2762 8.31105 13.8227 7.20767 12.9157 6.30907C12.0087 5.41116 10.9099 4.96221 9.61919 4.96221C8.31105 4.96221 7.20802 5.41116 6.31012 6.30907C5.41151 7.20767 4.96221 8.31105 4.96221 9.61919C4.96221 10.9099 5.41151 12.0087 6.31012 12.9157C7.20802 13.8227 8.31105 14.2762 9.61919 14.2762Z" fill="currentColor"></path></g></svg></a><button color="darkGray" class="sc-bqiRlB fldlST">로그인</button></div></div></div></div><div class="sc-TBWPX dXONqK sc-jQrDum fiOuRZ"><div class="head-wrapper"><h1>[Github] 사용법</h1><div class="sc-fvxzrP jGdQwA"><div class="information"><span class="username"><a href="https://velog.io/@eldoradodo/posts" class="sc-egiyK cyyZlI">DO YEON KIM</a></span><span class="separator">·</span><span>2023년 5월 16일</span></div><div class="sc-fbyfCU eYeYLy"><div data-testid="follow-btn" class="sc-avest iIZjji"><button class="follow-button button"><span>팔로우</span></button></div><button data-testid="like-btn" class="sc-eldieg gyXrCE"><svg width="24" height="24" viewBox="0 0 24 24"><path fill="currentColor" d="M18 1l-6 4-6-4-6 5v7l12 10 12-10v-7z"></path></svg><span>0</span></button></div></div><div class="sc-cZMNgc bpMcZw"><a class="sc-dtMgUX gISUXI" href="/tags/github">github</a><a class="sc-dtMgUX gISUXI" href="/tags/깃허브">깃허브</a></div><div class="sc-bQtKYq kzTxBt"><div class="sc-fXEqDS brUzDR"><div class="sc-jHkVzv sc-FNXRL knjEeh"><div data-testid="like" active="false" style="transform:scale(1)" class="sc-jWUzzU gCPYbd"><svg width="24" height="24" viewBox="0 0 24 24"><path fill="currentColor" d="M18 1l-6 4-6-4-6 5v7l12 10 12-10v-7z"></path></svg></div><div class="sc-eFegNN djwcYU">0</div><div class="sc-fmBCVi dZrsFD"><div class="positioner"><div style="opacity:0;transform:translate(0px, 0px)" class="sc-lkgTHX bxhFtZ"><div class="sc-jWUzzU gCPYbd"><svg stroke="currentColor" fill="currentColor" stroke-width="0" viewBox="0 0 512 512" height="1em" width="1em" xmlns="http://www.w3.org/2000/svg"><path d="M504 256C504 119 393 8 256 8S8 119 8 256c0 123.78 90.69 226.38 209.25 245V327.69h-63V256h63v-54.64c0-62.15 37-96.48 93.67-96.48 27.14 0 55.52 4.84 55.52 4.84v61h-31.28c-30.8 0-40.41 19.12-40.41 38.73V256h68.78l-11 71.69h-57.78V501C413.31 482.38 504 379.78 504 256z"></path></svg></div></div><div style="opacity:0;transform:translate(0px)" class="sc-lkgTHX bxhFtZ"><div class="sc-jWUzzU gCPYbd"><svg stroke="currentColor" fill="currentColor" stroke-width="0" viewBox="0 0 512 512" height="1em" width="1em" xmlns="http://www.w3.org/2000/svg"><path d="M459.37 151.716c.325 4.548.325 9.097.325 13.645 0 138.72-105.583 298.558-298.558 298.558-59.452 0-114.68-17.219-161.137-47.106 8.447.974 16.568 1.299 25.34 1.299 49.055 0 94.213-16.568 130.274-44.832-46.132-.975-84.792-31.188-98.112-72.772 6.498.974 12.995 1.624 19.818 1.624 9.421 0 18.843-1.3 27.614-3.573-48.081-9.747-84.143-51.98-84.143-102.985v-1.299c13.969 7.797 30.214 12.67 47.431 13.319-28.264-18.843-46.781-51.005-46.781-87.391 0-19.492 5.197-37.36 14.294-52.954 51.655 63.675 129.3 105.258 216.365 109.807-1.624-7.797-2.599-15.918-2.599-24.04 0-57.828 46.782-104.934 104.934-104.934 30.213 0 57.502 12.67 76.67 33.137 23.715-4.548 46.456-13.32 66.599-25.34-7.798 24.366-24.366 44.833-46.132 57.827 21.117-2.273 41.584-8.122 60.426-16.243-14.292 20.791-32.161 39.308-52.628 54.253z"></path></svg></div></div><div style="opacity:0;transform:translate(0px, 0px)" class="sc-lkgTHX bxhFtZ"><div class="sc-jWUzzU gCPYbd"><svg width="24" height="24" viewBox="0 0 24 24"><path d="M21.586 10.461l-10.05 10.075c-1.95 1.949-5.122 1.949-7.071 0s-1.95-5.122 0-7.072l10.628-10.585c1.17-1.17 3.073-1.17 4.243 0 1.169 1.17 1.17 3.072 0 4.242l-8.507 8.464c-.39.39-1.024.39-1.414 0s-.39-1.024 0-1.414l7.093-7.05-1.415-1.414-7.093 7.049c-1.172 1.172-1.171 3.073 0 4.244s3.071 1.171 4.242 0l8.507-8.464c.977-.977 1.464-2.256 1.464-3.536 0-2.769-2.246-4.999-5-4.999-1.28 0-2.559.488-3.536 1.465l-10.627 10.583c-1.366 1.368-2.05 3.159-2.05 4.951 0 3.863 3.13 7 7 7 1.792 0 3.583-.684 4.95-2.05l10.05-10.075-1.414-1.414z" fill="currentColor"></path></svg></div></div></div></div><div><div style="position:relative" class="sc-jWUzzU gCPYbd"><svg width="24" height="24" viewBox="0 0 24 24" class="share"><path fill="currentColor" d="M5 7c2.761 0 5 2.239 5 5s-2.239 5-5 5-5-2.239-5-5 2.239-5 5-5zm11.122 12.065c-.073.301-.122.611-.122.935 0 2.209 1.791 4 4 4s4-1.791 4-4-1.791-4-4-4c-1.165 0-2.204.506-2.935 1.301l-5.488-2.927c-.23.636-.549 1.229-.943 1.764l5.488 2.927zm7.878-15.065c0-2.209-1.791-4-4-4s-4 1.791-4 4c0 .324.049.634.122.935l-5.488 2.927c.395.535.713 1.127.943 1.764l5.488-2.927c.731.795 1.77 1.301 2.935 1.301 2.209 0 4-1.791 4-4z"></path></svg></div></div></div></div></div></div></div><div class="sc-TBWPX dXONqK sc-kmQMED cALPIq"><ins class="adsbygoogle" style="display:block;text-align:center" data-ad-layout="in-article" data-ad-format="fluid" data-ad-client="ca-pub-9161852896103498" data-ad-slot="6869845586"></ins></div><div class="sc-dFtzxp bfzjcP"><div class="sc-bXTejn FTZwa"><div class="sc-eGRUor gdnhbG atom-one"><p><img src="https://velog.velcdn.com/images/eldoradodo/post/6ece1985-708f-469c-ace8-d45fc40c9874/image.png" /></p>
<p>고학년이 되고서 프로젝트의 규모가 커지기도 하고 장차 다인원 프로젝트를 진행하게 되었을 때를 대비하여 깃허브 및 깃허브 데스크 탑의 사용을 보다 더 유연하게 하고자 작성하게 되었다.<br />
항상 여러 부분에서 헷갈려 하면서 업로드하곤 하였는데 정리 겸 작성해보려 한다.</p>
<hr />
<h2 id="1github이란">1.Github이란?</h2>
<p>깃허브는 sw개발 플젝을 위한 소스코드 관리 서비스이다. 소스 코드 열람 및 간단한 버그 관리, sns 기능까지 갖추고 있어 다인원 프로젝트에도 유용하다. 깃허브를 사용하여 버전을 관리하는 기업도 다수이기 때문에 사용법을 익혀두는 것이 좋다.</p>
<h2 id="2-github-사용법">2. Github 사용법</h2>
<h3 id="2-1-회원-가입">2-1. 회원 가입</h3>
<p>우선 <a href="https://github.com/">Github</a> 에 signin 해준다. 등록한 메일 주소로 인증을 해주면 계정 등록이 완료 된다. 필자는 기존에 사용하던 닉네임을 다 뺏겨서 생전 사용안하던 인스타 아이디를 아이디로 했다.</p>
<h3 id="2-2-필수-개념">2-2. 필수 개념</h3>
<p>깃허브를 사용하기 위해선 아래와 같은 개념이 필수적이다.</p>
<ul>
<li>commit : 파일을 추가하거나 변경 내용을 저장소에 저장하는 작업</li>
<li>push : 파일을 추가하거나 변경 내용을 원격 저장소에 업로드 하는 작업</li>
</ul>
<hr />
<ul>
<li>로컬 저장소 : 자신의 컴퓨터에 있는 저장소</li>
<li>원격 저장소 : 서버 등의 네트워크에 있는 저장소</li>
</ul>
<p>기본적으로 로컬 저장소에서 작업을 수행하고 그 결과를 원격 저장소에 저장하는 방식을 사용한다. 줄여서 repo라고 부르기도 한다.</p>
<ul>
<li>커맨드 라인 ( Command Line )</li>
</ul>
<p>윈도에서는 명령 프롬프트(cmd)에서, 맥이나 다른 OS에서는 터미널이라고 하는 프로그램.<br />
우리가 일반적으로 접하는 마우스로 클릭하는 프로그램이 아닌 키보드로 입력을 받아 명령을 수행한다.</p>
<ul>
<li>버전 관리 ( Version Control )</li>
</ul>
<p>팀 단위로 프로젝트를 운영할 때 필수적인 기능인데, 깃허브는 다수의 사용자가 하나의 페이지를 수정해도 각 사용자별로 수정 내용을 저장한다. 모든 시점의 '스냅 샷'을 저장하기 때문에 겹쳐 쓸 일이 없다.</p>
<ul>
<li>브랜치 : sw 개발은 현재 출시하고 있는 버전의 유지 보수를 하면서도 새로운 기능 추가 및 버그 수정을 할 수 있다. 이러한 병렬로 수행되는 여러 버전 관리를 위해 브랜치라는 기능을 사용한다. 분기 한 지점은 다른 지점의 영향을 받지 않기 때문에 같은 저장소에서 각 개발을 해 나갈 수 있다. 작업을 마무리하면 프로젝트 메인 디렉토리인 master에 브랜치를 merge한다.</li>
</ul>
<hr />
<h3 id="2-3-사용법">2-3. 사용법</h3>
<ol>
<li>Github 저장소 작성 (git init) 또는 복제 (git clone)</li>
<li>파일의 작성, 편집</li>
<li>파일의 생성 / 변경 / 삭제를 git 인덱스에 추가 (git add)</li>
<li>변경 결과를 로컬 저장소에 커밋</li>
<li>로컬 저장소를 푸쉬해 원격 저장소에 반영 (git push)</li>
</ol>
<p>이와 같은 흐름으로 진행되고 있으며 1번의 작성은 처음 한 번만 진행되며 2~5를 반복</p>
<p>기본적으로 작은 작업 단위로 커밋을 하고, 어느 정도로 작업이 일단락 했을 때 푸시를 하는 것이 일반적. 커밋 작업이 알기 쉽게 커밋 메세지를 남겨두면 로그를 따라가는데 도움이 된다.</p>
<hr />
<p>create new repository을 통해 저장소를 생성할 수 있다. description에는 저장소의 설명을 입력할 수 있다. 필자는 readme 파일을 미리 생성해 둘 것이기 때문에 체크를 하였다.</p>
<p><img src="https://velog.velcdn.com/images/eldoradodo/post/4c1253c3-9ba3-4406-a5f3-6a195aea1974/image.png" /></p>
<p><img src="https://velog.velcdn.com/images/eldoradodo/post/37a86f0d-e52f-4b1c-a21b-2b079ac546c1/image.png" /><br />
생성된 모습이다</p>
<hr />
<p>로컬 저장소에서 test.html이라는 파일을 생성해준다.</p>
<p><img src="https://velog.velcdn.com/images/eldoradodo/post/def69265-436c-45ec-96c7-bdd20cfee19a/image.png" /></p>
<hr />
<p><img src="https://velog.velcdn.com/images/eldoradodo/post/bd430220-dbbd-4b7d-a97a-68e40550010b/image.png" /></p>
<p>gitbash에 pwd 명령어를 입력하여 현재 자신의 위치를 확인해준다. </p>
<hr />
<p>github에 있는 저장소를 가져와야한다. 필자는 C:\Users\user\test에 저장할 예정이다.</p>
<p><img src="https://velog.velcdn.com/images/eldoradodo/post/86efbeb8-b06f-44d3-9b38-f28875fe08d9/image.png" /></p>
<p>cd 명령어를 사용하여 내려가 준다.</p>
<hr />
<p><img src="https://velog.velcdn.com/images/eldoradodo/post/7e838bd4-5f03-4baa-82ec-245bafb41b4c/image.png" /></p>
<p>이후 git clone (repo 주소)를 입력해주면 위와 같은 방법으로 저장소를 가져오게 된다. ls 명령어를 입력하여 성공적으로 저장소를 가져온 것을 확인 할 수 있다.</p>
<hr />
<h3 id="2-4-간단한-git-명령어">2-4. 간단한 git 명령어</h3>
<ul>
<li>git init : 현재 디렉터리를 Git 저장소로 변환해줍니다.</li>
<li>git add : 파일을 원격 저장소에 추가합니다. ( 예시로 test1.py를 추가하려면 git add test1.py  실제 추가가 아니라 깃의 저장소의 스냅샷에 포함된다고 생각하면 될듯 합니다.)<br />
git commit : 디렉토리의 변경과 추가를 저장소에 기록합니다. ( git commit -m "New File" : 커밋 시 남길 메시지)</li>
<li>git push : 로컬 저장소의 변경사항을 github에 반영합니다. ( git push origin master )</li>
<li>git checkout : 현재 위치하고 있지 않은 저장소를 체크아웃합니다. (예를 들어 master 브랜치를 보고 싶으면, git checkout master를 사용할 수 있습니다.)</li>
<li>git merge : 브랜치에서 하던 작업을 끝내고, 동료가 볼 수 있는 master브랜치로 합치는 과정입니다.</li>
<li>git pull : 로컬 저장소 작업할 때, 작업하고 있는 저장소의 최신 버전을 받아옵니다.</li>
</ul>
<hr />
<h3 id="2--5실제-로컬에서-작업한-작업물을-원격-저장소로-옮기는-방법">2- 5.실제 로컬에서 작업한 작업물을 원격 저장소로 옮기는 방법</h3>
<p>cmd 창을 열어 저장할 파일이 있는 파일로 이동 후</p>
<p><strong>git init</strong> 을 사용하여 원격 저장소와 연결할 수 있는 git 파일을 생성한 후</p>
<p>로컬에 올리고 싶은 파일을 <strong>git add 파일명</strong> 을 이용하여 git이 그 파일을 보도록 한 뒤</p>
<p>git commit -m "first commit" 이후 커밋을 해준다. </p>
<p><strong>git remote -v</strong> (깃허브 remote 상태 보는 명령어) 를 입력해서 아무것도 뜨지 않으면 자신의 repo에 들어가 링크를 복사한 후 git remote add origin '복사한 링크'를 사용하여 remote를 완료해준다.</p>
<p>이후에 git push -u origin master를 이용해서 로컬 저장소에 있는 파일을 원격으로 push 해준다. 원격에서 확인해보면, 파일이 성공적으로 올라간 것을 확인해 볼 수 있다.</p></div></div></div><div class="sc-TBWPX dXONqK sc-djWRfJ bksdVp"><div class="sc-gjNHFA kTQxVU"><div class="sc-fmciRz gPzODR"><div class="left"><a href="https://velog.io/@eldoradodo/posts" class="sc-egiyK cyyZlI"><img src="https://velog.velcdn.com/images/eldoradodo/profile/18245667-006e-42dd-a299-6b0a76cdcdbb/social_profile.png" alt="profile"/></a><div class="sc-eXlEPa yXXbT"><div class="name"><a href="https://velog.io/@eldoradodo/posts" class="sc-egiyK cyyZlI">DO YEON KIM</a></div><div class="description">프론트엔드 개발자를 향해서</div></div></div><div class="right"><div data-testid="follow-btn" class="sc-avest iIZjji"><button class="follow-button button"><span>팔로우</span></button></div></div></div><div class="sc-iFMAIt hbZRXU"></div><div class="sc-iqVWFU koQQwu"></div></div></div><div class="sc-TBWPX dXONqK sc-fIosxK dpmQGl"><div class="sc-gyElHZ bVYpNI"><a class="sc-gUQvok hlGICj" href="/@eldoradodo/프로그래머스-JavaScript-고양이-사진-검색-사이트-ny8v28au"><div class="sc-hjGZqJ fibSC"><svg stroke="currentColor" fill="currentColor" stroke-width="0" viewBox="0 0 24 24" height="1em" width="1em" xmlns="http://www.w3.org/2000/svg"><path d="M20 11H7.83l5.59-5.59L12 4l-8 8 8 8 1.41-1.41L7.83 13H20v-2z"></path></svg></div><div class="sc-fXeWAj fKjWde"><div class="description">이전<!-- --> 포스트</div><h3>[프로그래머스 JavaScript] 고양이 사진 검색 사이트</h3></div></a></div><div class="sc-gyElHZ bVYpNI"><a class="sc-gUQvok jSBDGM" href="/@eldoradodo/프로그래머스-JavaScript-연속-부분-수열-합의-개수"><div class="sc-hjGZqJ cMDwOh"><svg stroke="currentColor" fill="currentColor" stroke-width="0" viewBox="0 0 24 24" height="1em" width="1em" xmlns="http://www.w3.org/2000/svg"><path d="M12 4l-1.41 1.41L16.17 11H4v2h12.17l-5.58 5.59L12 20l8-8z"></path></svg></div><div class="sc-fXeWAj cQpWGt"><div class="description">다음<!-- --> 포스트</div><h3>[프로그래머스 JavaScript] 연속 부분 수열 합의 개수</h3></div></a></div></div><div class="sc-TBWPX dXONqK sc-kmQMED cALPIq"><ins class="adsbygoogle" style="display:block;text-align:center" data-ad-layout="in-article" data-ad-format="fluid" data-ad-client="ca-pub-9161852896103498" data-ad-slot="6869845586"></ins></div><div class="sc-TBWPX dXONqK sc-brSvTw cgYvDI"><h4>0<!-- -->개의 댓글</h4><div class="sc-gIDmLj"><div class="sc-evcjhq BdYrx"><textarea placeholder="댓글을 작성하세요" class="sc-fHeRUh fQjmlN" style="height:0"></textarea><div class="buttons-wrapper"><button color="teal" class="sc-jrQzAO hSMJOX">댓글 <!-- -->작성</button></div></div><div class="sc-dVNjXY dDifDS"><div class="sc-xiLah"></div></div></div></div></div><div class="Toastify"></div></div><script>window.__APOLLO_STATE__={"ROOT_QUERY":{"auth":null,"velog_config({\"username\":\"eldoradodo\"})":{"type":"id","generated":true,"id":"$ROOT_QUERY.velog_config({\"username\":\"eldoradodo\"})","typename":"VelogConfig"},"bannerAds({\"writer_username\":\"eldoradodo\"})":[],"post({\"url_slug\":\"an96ydx7\",\"username\":\"eldoradodo\"})":{"type":"id","generated":false,"id":"Post:697030f2-4952-46a3-a13d-ed38deb14a16","typename":"Post"}},"$ROOT_QUERY.velog_config({\"username\":\"eldoradodo\"})":{"title":null,"logo_image":null,"__typename":"VelogConfig"},"Post:697030f2-4952-46a3-a13d-ed38deb14a16":{"id":"697030f2-4952-46a3-a13d-ed38deb14a16","title":"[Github] 사용법","released_at":"2023-05-16T23:34:50.051Z","updated_at":"2024-07-31T01:57:30.310Z","tags":{"type":"json","json":["github","깃허브"]},"body":"![](https://velog.velcdn.com/images/eldoradodo/post/6ece1985-708f-469c-ace8-d45fc40c9874/image.png)\n\n\n고학년이 되고서 프로젝트의 규모가 커지기도 하고 장차 다인원 프로젝트를 진행하게 되었을 때를 대비하여 깃허브 및 깃허브 데스크 탑의 사용을 보다 더 유연하게 하고자 작성하게 되었다.\n항상 여러 부분에서 헷갈려 하면서 업로드하곤 하였는데 정리 겸 작성해보려 한다.\n\n---\n\n## 1.Github이란?\n\n\n깃허브는 sw개발 플젝을 위한 소스코드 관리 서비스이다. 소스 코드 열람 및 간단한 버그 관리, sns 기능까지 갖추고 있어 다인원 프로젝트에도 유용하다. 깃허브를 사용하여 버전을 관리하는 기업도 다수이기 때문에 사용법을 익혀두는 것이 좋다.\n\n## 2. Github 사용법\n\n### 2-1. 회원 가입\n\n우선 [Github](https://github.com/) 에 signin 해준다. 등록한 메일 주소로 인증을 해주면 계정 등록이 완료 된다. 필자는 기존에 사용하던 닉네임을 다 뺏겨서 생전 사용안하던 인스타 아이디를 아이디로 했다.\n\n### 2-2. 필수 개념\n\n깃허브를 사용하기 위해선 아래와 같은 개념이 필수적이다.\n\n- commit : 파일을 추가하거나 변경 내용을 저장소에 저장하는 작업\n- push : 파일을 추가하거나 변경 내용을 원격 저장소에 업로드 하는 작업\n\n---\n\n- 로컬 저장소 : 자신의 컴퓨터에 있는 저장소\n- 원격 저장소 : 서버 등의 네트워크에 있는 저장소\n\n기본적으로 로컬 저장소에서 작업을 수행하고 그 결과를 원격 저장소에 저장하는 방식을 사용한다. 줄여서 repo라고 부르기도 한다.\n\n- 커맨드 라인 ( Command Line )\n \n윈도에서는 명령 프롬프트(cmd)에서, 맥이나 다른 OS에서는 터미널이라고 하는 프로그램.\n우리가 일반적으로 접하는 마우스로 클릭하는 프로그램이 아닌 키보드로 입력을 받아 명령을 수행한다.\n\n\n- 버전 관리 ( Version Control )\n\n팀 단위로 프로젝트를 운영할 때 필수적인 기능인데, 깃허브는 다수의 사용자가 하나의 페이지를 수정해도 각 사용자별로 수정 내용을 저장한다. 모든 시점의 '스냅 샷'을 저장하기 때문에 겹쳐 쓸 일이 없다.\n\n- 브랜치 : sw 개발은 현재 출시하고 있는 버전의 유지 보수를 하면서도 새로운 기능 추가 및 버그 수정을 할 수 있다. 이러한 병렬로 수행되는 여러 버전 관리를 위해 브랜치라는 기능을 사용한다. 분기 한 지점은 다른 지점의 영향을 받지 않기 때문에 같은 저장소에서 각 개발을 해 나갈 수 있다. 작업을 마무리하면 프로젝트 메인 디렉토리인 master에 브랜치를 merge한다.\n\n---\n\n### 2-3. 사용법\n\n1. Github 저장소 작성 (git init) 또는 복제 (git clone)\n2. 파일의 작성, 편집\n3. 파일의 생성 / 변경 / 삭제를 git 인덱스에 추가 (git add)\n4. 변경 결과를 로컬 저장소에 커밋\n5. 로컬 저장소를 푸쉬해 원격 저장소에 반영 (git push)\n\n이와 같은 흐름으로 진행되고 있으며 1번의 작성은 처음 한 번만 진행되며 2~5를 반복\n\n기본적으로 작은 작업 단위로 커밋을 하고, 어느 정도로 작업이 일단락 했을 때 푸시를 하는 것이 일반적. 커밋 작업이 알기 쉽게 커밋 메세지를 남겨두면 로그를 따라가는데 도움이 된다.\n\n---\n\ncreate new repository을 통해 저장소를 생성할 수 있다. description에는 저장소의 설명을 입력할 수 있다. 필자는 readme 파일을 미리 생성해 둘 것이기 때문에 체크를 하였다.\n\n![](https://velog.velcdn.com/images/eldoradodo/post/4c1253c3-9ba3-4406-a5f3-6a195aea1974/image.png)\n\n![](https://velog.velcdn.com/images/eldoradodo/post/37a86f0d-e52f-4b1c-a21b-2b079ac546c1/image.png)\n생성된 모습이다\n\n---\n로컬 저장소에서 test.html이라는 파일을 생성해준다.\n\n![](https://velog.velcdn.com/images/eldoradodo/post/def69265-436c-45ec-96c7-bdd20cfee19a/image.png)\n\n---\n\n![](https://velog.velcdn.com/images/eldoradodo/post/bd430220-dbbd-4b7d-a97a-68e40550010b/image.png)\n\ngitbash에 pwd 명령어를 입력하여 현재 자신의 위치를 확인해준다. \n\n---\n\ngithub에 있는 저장소를 가져와야한다. 필자는 C:\\Users\\user\\test에 저장할 예정이다.\n\n![](https://velog.velcdn.com/images/eldoradodo/post/86efbeb8-b06f-44d3-9b38-f28875fe08d9/image.png)\n\n\ncd 명령어를 사용하여 내려가 준다.\n\n---\n\n![](https://velog.velcdn.com/images/eldoradodo/post/7e838bd4-5f03-4baa-82ec-245bafb41b4c/image.png)\n\n\n이후 git clone (repo 주소)를 입력해주면 위와 같은 방법으로 저장소를 가져오게 된다. ls 명령어를 입력하여 성공적으로 저장소를 가져온 것을 확인 할 수 있다.\n\n---\n### 2-4. 간단한 git 명령어\n\n- git init : 현재 디렉터리를 Git 저장소로 변환해줍니다.\n- git add : 파일을 원격 저장소에 추가합니다. ( 예시로 test1.py를 추가하려면 git add test1.py  실제 추가가 아니라 깃의 저장소의 스냅샷에 포함된다고 생각하면 될듯 합니다.)\ngit commit : 디렉토리의 변경과 추가를 저장소에 기록합니다. ( git commit -m \"New File\" : 커밋 시 남길 메시지)\n- git push : 로컬 저장소의 변경사항을 github에 반영합니다. ( git push origin master )\n- git checkout : 현재 위치하고 있지 않은 저장소를 체크아웃합니다. (예를 들어 master 브랜치를 보고 싶으면, git checkout master를 사용할 수 있습니다.)\n- git merge : 브랜치에서 하던 작업을 끝내고, 동료가 볼 수 있는 master브랜치로 합치는 과정입니다.\n- git pull : 로컬 저장소 작업할 때, 작업하고 있는 저장소의 최신 버전을 받아옵니다.\n\n\n---\n\n### 2- 5.실제 로컬에서 작업한 작업물을 원격 저장소로 옮기는 방법\n\ncmd 창을 열어 저장할 파일이 있는 파일로 이동 후\n\n**git init** 을 사용하여 원격 저장소와 연결할 수 있는 git 파일을 생성한 후\n\n로컬에 올리고 싶은 파일을 **git add 파일명** 을 이용하여 git이 그 파일을 보도록 한 뒤\n\ngit commit -m \"first commit\" 이후 커밋을 해준다. \n\n**git remote -v** (깃허브 remote 상태 보는 명령어) 를 입력해서 아무것도 뜨지 않으면 자신의 repo에 들어가 링크를 복사한 후 git remote add origin '복사한 링크'를 사용하여 remote를 완료해준다.\n\n이후에 git push -u origin master를 이용해서 로컬 저장소에 있는 파일을 원격으로 push 해준다. 원격에서 확인해보면, 파일이 성공적으로 올라간 것을 확인해 볼 수 있다.\n\n","short_description":"고학년이 되고서 프로젝트의 규모가 커지기도 하고 장차 다인원 프로젝트를 진행하게 되었을 때를 대비하여 깃허브 및 깃허브 데스크 탑의 사용을 보다 더 유연하게 하고자 작성하게 되었다.항상 여러 부분에서 헷갈려 하면서 업로드하곤 하였는데 정리 겸 작성해보려 한다.1.Git","is_markdown":true,"is_private":false,"is_temp":false,"thumbnail":"https://velog.velcdn.com/images/eldoradodo/post/6ece1985-708f-469c-ace8-d45fc40c9874/image.png","comments_count":0,"url_slug":"an96ydx7","likes":0,"liked":false,"user":{"type":"id","generated":false,"id":"User:4ecfb2bb-3e4c-4cc9-9e8e-124bb7773f19","typename":"User"},"comments":[],"series":null,"linked_posts":{"type":"id","generated":true,"id":"$Post:697030f2-4952-46a3-a13d-ed38deb14a16.linked_posts","typename":"LinkedPosts"},"__typename":"Post"},"User:4ecfb2bb-3e4c-4cc9-9e8e-124bb7773f19":{"id":"4ecfb2bb-3e4c-4cc9-9e8e-124bb7773f19","username":"eldoradodo","is_followed":false,"profile":{"type":"id","generated":false,"id":"UserProfile:8ebbfdf3-57db-4e2b-9ac0-b929468cd2f9","typename":"UserProfile"},"velog_config":{"type":"id","generated":true,"id":"$User:4ecfb2bb-3e4c-4cc9-9e8e-124bb7773f19.velog_config","typename":"VelogConfig"},"__typename":"User"},"UserProfile:8ebbfdf3-57db-4e2b-9ac0-b929468cd2f9":{"id":"8ebbfdf3-57db-4e2b-9ac0-b929468cd2f9","display_name":"DO YEON KIM","thumbnail":"https://velog.velcdn.com/images/eldoradodo/profile/18245667-006e-42dd-a299-6b0a76cdcdbb/social_profile.png","short_bio":"프론트엔드 개발자를 향해서","profile_links":{"type":"json","json":{}},"__typename":"UserProfile"},"$User:4ecfb2bb-3e4c-4cc9-9e8e-124bb7773f19.velog_config":{"title":null,"__typename":"VelogConfig"},"Post:126435a9-e7f7-46cc-b2f6-d17afcbe6bc4":{"id":"126435a9-e7f7-46cc-b2f6-d17afcbe6bc4","title":"[프로그래머스 JavaScript] 고양이 사진 검색 사이트","url_slug":"프로그래머스-JavaScript-고양이-사진-검색-사이트-ny8v28au","user":{"type":"id","generated":false,"id":"User:4ecfb2bb-3e4c-4cc9-9e8e-124bb7773f19","typename":"User"},"__typename":"Post"},"$Post:697030f2-4952-46a3-a13d-ed38deb14a16.linked_posts":{"previous":{"type":"id","generated":false,"id":"Post:126435a9-e7f7-46cc-b2f6-d17afcbe6bc4","typename":"Post"},"next":{"type":"id","generated":false,"id":"Post:f429deed-3c22-4368-8409-d46322a490f8","typename":"Post"},"__typename":"LinkedPosts"},"Post:f429deed-3c22-4368-8409-d46322a490f8":{"id":"f429deed-3c22-4368-8409-d46322a490f8","title":"[프로그래머스 JavaScript] 연속 부분 수열 합의 개수","url_slug":"프로그래머스-JavaScript-연속-부분-수열-합의-개수","user":{"type":"id","generated":false,"id":"User:4ecfb2bb-3e4c-4cc9-9e8e-124bb7773f19","typename":"User"},"__typename":"Post"}};</script><script>window.__REDUX_STATE__={"core":{"layer":false,"auth":{"visible":false,"mode":"LOGIN"},"user":null,"popup":{"visible":false,"title":"","message":""}},"write":{"mode":"MARKDOWN","markdown":"","title":"","html":"","tags":[],"publish":false,"textBody":"","defaultDescription":"","description":"","isPrivate":false,"urlSlug":"","thumbnail":null,"editSeries":false,"selectedSeries":null,"postId":null,"isTemp":false,"initialTitle":"","initialBody":""},"header":{"custom":true,"userLogo":{"title":null,"logo_image":null},"username":"eldoradodo"},"post":{"id":null},"error":{"errorType":null},"scroll":{"main":0,"user/posts":0},"home":{"timeframe":"week"},"darkMode":{"theme":"default","systemTheme":"not-ready"}};</script><script id="__LOADABLE_REQUIRED_CHUNKS__" type="application/json">[18,0,23,1,3]</script><script id="__LOADABLE_REQUIRED_CHUNKS___ext" type="application/json">{"namedChunks":["pages-velog-VelogPage","PostPage"]}</script><script async="" data-chunk="main" src="https://static.velog.io/static/js/runtime-main.9e7b02fe.js"></script><script async="" data-chunk="main" src="https://static.velog.io/static/js/20.76da1523.chunk.js"></script><script async="" data-chunk="main" src="https://static.velog.io/static/js/main.630a53bb.chunk.js"></script><script async="" data-chunk="pages-velog-VelogPage" src="https://static.velog.io/static/js/pages-velog-VelogPage.dabf735b.chunk.js"></script><script async="" data-chunk="PostPage" src="https://static.velog.io/static/js/0.79976788.chunk.js"></script><script async="" data-chunk="PostPage" src="https://static.velog.io/static/js/23.2e3f2cf1.chunk.js"></script><script async="" data-chunk="PostPage" src="https://static.velog.io/static/js/1.6ba86eda.chunk.js"></script><script async="" data-chunk="PostPage" src="https://static.velog.io/static/js/PostPage.42edd71f.chunk.js"></script></body></html>