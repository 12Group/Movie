package com.twelfth.moviedom.bean;

import java.util.List;

public class HomeBean {



    private int code;
    private String msg;


    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private String nextPageUrl;


        private List<DailyListBean> dailyList;

        public String getNextPageUrl() {
            return nextPageUrl;
        }

        public void setNextPageUrl(String nextPageUrl) {
            this.nextPageUrl = nextPageUrl;
        }

        public List<DailyListBean> getDailyList() {
            return dailyList;
        }

        public void setDailyList(List<DailyListBean> dailyList) {
            this.dailyList = dailyList;
        }

        public static class DailyListBean {
            private int date;
            private int total;

            private List<VideolistBean> videolist;

            public int getDate() {
                return date;
            }

            public void setDate(int date) {
                this.date = date;
            }

            public int getTotal() {
                return total;
            }

            public void setTotal(int total) {
                this.total = total;
            }

            public List<VideolistBean> getVideolist() {
                return videolist;
            }

            public void setVideolist(List<VideolistBean> videolist) {
                this.videolist = videolist;
            }

            public static class VideolistBean {
                private String id;
                private int cid;
                private String title;
                private String description;
                private int ctime;
                private int duration;
                private String playUrl;
                private String provider;
                private int collectionCount;
                private int shareCount;
                private int playCount;
                private int replyCount;
                private String author;
                private String adTrack;
                private String coverBlurred;
                private String isVR;
                private int vid;
                private int idx;
                private String video_cate;
                private String rawWebUrl;
                private String thumbnail;


                private List<PlayInfoBean> playInfo;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public int getCid() {
                    return cid;
                }

                public void setCid(int cid) {
                    this.cid = cid;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public int getCtime() {
                    return ctime;
                }

                public void setCtime(int ctime) {
                    this.ctime = ctime;
                }

                public int getDuration() {
                    return duration;
                }

                public void setDuration(int duration) {
                    this.duration = duration;
                }

                public String getPlayUrl() {
                    return playUrl;
                }

                public void setPlayUrl(String playUrl) {
                    this.playUrl = playUrl;
                }

                public String getProvider() {
                    return provider;
                }

                public void setProvider(String provider) {
                    this.provider = provider;
                }

                public int getCollectionCount() {
                    return collectionCount;
                }

                public void setCollectionCount(int collectionCount) {
                    this.collectionCount = collectionCount;
                }

                public int getShareCount() {
                    return shareCount;
                }

                public void setShareCount(int shareCount) {
                    this.shareCount = shareCount;
                }

                public int getPlayCount() {
                    return playCount;
                }

                public void setPlayCount(int playCount) {
                    this.playCount = playCount;
                }

                public int getReplyCount() {
                    return replyCount;
                }

                public void setReplyCount(int replyCount) {
                    this.replyCount = replyCount;
                }

                public String getAuthor() {
                    return author;
                }

                public void setAuthor(String author) {
                    this.author = author;
                }

                public String getAdTrack() {
                    return adTrack;
                }

                public void setAdTrack(String adTrack) {
                    this.adTrack = adTrack;
                }

                public String getCoverBlurred() {
                    return coverBlurred;
                }

                public void setCoverBlurred(String coverBlurred) {
                    this.coverBlurred = coverBlurred;
                }

                public String getIsVR() {
                    return isVR;
                }

                public void setIsVR(String isVR) {
                    this.isVR = isVR;
                }

                public int getVid() {
                    return vid;
                }

                public void setVid(int vid) {
                    this.vid = vid;
                }

                public int getIdx() {
                    return idx;
                }

                public void setIdx(int idx) {
                    this.idx = idx;
                }

                public String getVideo_cate() {
                    return video_cate;
                }

                public void setVideo_cate(String video_cate) {
                    this.video_cate = video_cate;
                }

                public String getRawWebUrl() {
                    return rawWebUrl;
                }

                public void setRawWebUrl(String rawWebUrl) {
                    this.rawWebUrl = rawWebUrl;
                }

                public String getThumbnail() {
                    return thumbnail;
                }

                public void setThumbnail(String thumbnail) {
                    this.thumbnail = thumbnail;
                }

                public List<PlayInfoBean> getPlayInfo() {
                    return playInfo;
                }

                public void setPlayInfo(List<PlayInfoBean> playInfo) {
                    this.playInfo = playInfo;
                }

                public static class PlayInfoBean {
                    private int height;
                    private int width;
                    private String name;
                    private String type;
                    private String url;

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }
                }
            }
        }
    }
}
