/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.wearable.alpha.data.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Data class for watch face arm dimensions.
 */
@Entity(tableName = "watch_face_arm_dimensions_table")
data class WatchFaceArmDimensionsEntity(
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: String,

    @ColumnInfo(name = "name")
    val name: String,

    @ColumnInfo(name = "width_fraction")
    val widthFraction: Float,

    @ColumnInfo(name = "length_fraction")
    val lengthFraction: Float,

    @ColumnInfo(name = "x_radius_rounded_corners")
    val xRadiusRoundedCorners: Float,

    @ColumnInfo(name = "y_radius_rounded_corners")
    val yRadiusRoundedCorners: Float
)
