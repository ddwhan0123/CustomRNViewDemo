'use strict';

import React, {Component, PropTypes} from 'react';
import {
    View,
    requireNativeComponent,
    processColor  // 字符Color转换为数字
} from 'react-native';

const MCircle = requireNativeComponent('MCircle', Circle);

export default class Circle extends Component {

    render() {
        const {style, radius, color} = this.props;

        return (
            <MCircle
                style={style}
                radius={radius}
                color={processColor(color)}
            />
        );
    }
}

Circle.propTypes = {
    radius: PropTypes.number,
    color: PropTypes.string, // 这里传过来的是string
    ...View.propTypes // 包含默认的View的属性
};