# 3주차 프리코스 과제 로또


## LottoNumber
- 로또 발행에 사용될 숫자들을 캐싱하여 보유한다.
- 숫자 혹은 숫자들을 받아 LottoNumebr반환
- 유효범위가 아닐 경우 예외 발생(e)
- 오름차순 정렬기능

## Lotto
- 개수와 중복 유효성 검사 기능 (e)
- 일치하는 개수를 카운팅 하는 기능
- 해당 숫자 포함여부 판별 기능

## PurchaseAmount
- 구입 금액의 유효성 검사(e)
- 구매할 로또 개수를 구하는 기능

## RandomNumbersGenerator
- 로또 발행에 사용할 랜덤 숫자 발생
- 숫자가 유효하지 않을 경우 다시 생성

## LottoTicket
- 발행된 로또들을  보유한 클래스

## LottoTicketFactory
- 입력 개수만큼 로또를 발행하고 LottoTicket을 반환

## WinningLotto
- 당첨번호 및 보너스 넘버 유효성 검사
- 로또를 매개값으로 랭킹을 판별하는 기능

## Ranking
- 맞은 개수, 보너스 넘버 체크 여부, 상금을 필드로 가지는 enum 클래스
- 맞은 개수와 보너스 넘버로 Ranking을 반환하는 기능

## WinningResult
- 전체 수익률을 계산하는 기능

