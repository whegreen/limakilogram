package id.limakilo.www.bawang.util.api.campaign;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import id.limakilo.www.bawang.util.api.RootResponseModel;

/**
 * Created by walesadanto on 11/8/15.
 */
public class GetCampaignResponseModel extends RootResponseModel {


    @SerializedName("data")
    @Expose
    private List<GetCampaignResponseData> data = new ArrayList<GetCampaignResponseData>();

    public List<GetCampaignResponseData> getData() {
        return data;
    }

    /**
     *
     * @param data
     * The data
     */
    public void setData(List<GetCampaignResponseData> data) {
        this.data = data;
    }


    public class GetCampaignResponseData {

        @SerializedName("cam_id")
        @Expose
        private Integer camId;
        @SerializedName("cam_title")
        @Expose
        private String camTitle;
        @SerializedName("cam_description")
        @Expose
        private String camDescription;
        @SerializedName("cam_image")
        @Expose
        private String camImage;
        @SerializedName("cam_progress")
        @Expose
        private String camProgress;
        @SerializedName("cam_available")
        @Expose
        private String camAvailable;
        @SerializedName("cam_target")
        @Expose
        private String camTarget;
        @SerializedName("cam_start_date")
        @Expose
        private String camStartDate;
        @SerializedName("cam_end_date")
        @Expose
        private String camEndDate;
        @SerializedName("cam_create_date")
        @Expose
        private String camCreateDate;
        @SerializedName("cam_usr_id")
        @Expose
        private Integer camUsrId;
        @SerializedName("cam_url")
        @Expose
        private String camUrl;
        @SerializedName("cam_status")
        @Expose
        private Integer camStatus;

        /**
         * @return The camId
         */
        public Integer getCamId() {
            return camId;
        }

        /**
         * @param camId The cam_id
         */
        public void setCamId(Integer camId) {
            this.camId = camId;
        }

        /**
         * @return The camTitle
         */
        public String getCamTitle() {
            return camTitle;
        }

        /**
         * @param camTitle The cam_title
         */
        public void setCamTitle(String camTitle) {
            this.camTitle = camTitle;
        }

        /**
         * @return The camDescription
         */
        public String getCamDescription() {
            return camDescription;
        }

        /**
         * @param camDescription The cam_description
         */
        public void setCamDescription(String camDescription) {
            this.camDescription = camDescription;
        }

        /**
         * @return The camImage
         */
        public String getCamImage() {
            return camImage;
        }

        /**
         * @param camImage The cam_image
         */
        public void setCamImage(String camImage) {
            this.camImage = camImage;
        }

        /**
         * @return The camProgress
         */
        public String getCamProgress() {
            return camProgress;
        }

        /**
         * @param camProgress The cam_progress
         */
        public void setCamProgress(String camProgress) {
            this.camProgress = camProgress;
        }

        /**
         * @return The camAvailable
         */
        public String getCamAvailable() {
            return camAvailable;
        }

        /**
         * @param camAvailable The cam_available
         */
        public void setCamAvailable(String camAvailable) {
            this.camAvailable = camAvailable;
        }

        /**
         * @return The camTarget
         */
        public String getCamTarget() {
            return camTarget;
        }

        /**
         * @param camTarget The cam_target
         */
        public void setCamTarget(String camTarget) {
            this.camTarget = camTarget;
        }

        /**
         * @return The camStartDate
         */
        public String getCamStartDate() {
            return camStartDate;
        }

        /**
         * @param camStartDate The cam_start_date
         */
        public void setCamStartDate(String camStartDate) {
            this.camStartDate = camStartDate;
        }

        /**
         * @return The camEndDate
         */
        public String getCamEndDate() {
            return camEndDate;
        }

        /**
         * @param camEndDate The cam_end_date
         */
        public void setCamEndDate(String camEndDate) {
            this.camEndDate = camEndDate;
        }

        /**
         * @return The camCreateDate
         */
        public String getCamCreateDate() {
            return camCreateDate;
        }

        /**
         * @param camCreateDate The cam_create_date
         */
        public void setCamCreateDate(String camCreateDate) {
            this.camCreateDate = camCreateDate;
        }

        /**
         * @return The camUsrId
         */
        public Integer getCamUsrId() {
            return camUsrId;
        }

        /**
         * @param camUsrId The cam_usr_id
         */
        public void setCamUsrId(Integer camUsrId) {
            this.camUsrId = camUsrId;
        }

        /**
         * @return The camUrl
         */
        public String getCamUrl() {
            return camUrl;
        }

        /**
         * @param camUrl The cam_url
         */
        public void setCamUrl(String camUrl) {
            this.camUrl = camUrl;
        }

        /**
         * @return The camStatus
         */
        public Integer getCamStatus() {
            return camStatus;
        }

        /**
         * @param camStatus The cam_status
         */
        public void setCamStatus(Integer camStatus) {
            this.camStatus = camStatus;
        }
    }
}
