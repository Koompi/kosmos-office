(ns app.renderer.components.insertTab)

(defn insertTab
  []
  [:div {:className "ribbonMainGroup"}
   [:ul
    [:li {:data "Break Page" :className "ribbonIconwithText" :style {:backgroundImage "url('img/pageBreak.png')"}} "Page Break"]
    [:li {:data "Create Table" :className "ribbonIconwithText" :style {:backgroundImage "url('img/table.png')"}} "Table"]
    [:li {:data "Insert Picture" :className "ribbonIconwithText" :style {:backgroundImage "url('img/picture.png')"}} "Picture"]
    [:li {:data "Insert Link" :className "ribbonIconwithText" :style {:backgroundImage "url('img/link.png')"}} "Link"]
    [:li {:data "Give Comments" :className "ribbonIconwithText" :style {:backgroundImage "url('img/comment.png')"}} "Comment"]
    [:li {:data "Header & Footer" :className "ribbonIconwithText" :style {:backgroundImage "url('img/headerFooter.png')"}} "Header & Footer"]
    [:li {:data "Page Number" :className "ribbonIconwithText" :style {:backgroundImage "url('img/pageNumber.png')"}} "Page Numbers"]
    [:li {:data "Break Page" :className "ribbonIconwithText" :style {:backgroundImage "url('img/symbols.png')"}} "Symbols"]
    [:li {:data "Break Page" :className "ribbonIconwithText" :style {:backgroundImage "url('img/emoji.png')"}} "Emoji"]
    [:li {:data "Break Page" :className "ribbonIconwithText" :style {:backgroundImage "url('img/sticker.png')"}} "Stickers"]]])
