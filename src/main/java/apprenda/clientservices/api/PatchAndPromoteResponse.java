package apprenda.clientservices.api;

import com.google.gson.annotations.SerializedName;

public class PatchAndPromoteResponse {
   @SerializedName("sections")
    public Section[] Sections;

    @SerializedName("success")
    public boolean Success;
}

